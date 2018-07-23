package com.jenkinsDockerMongoDB.jenkinsDockerMongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jenkinsDockerMongoDB.jenkinsDockerMongoDB.entity.Client;
import com.jenkinsDockerMongoDB.jenkinsDockerMongoDB.service.ClientService;


@RestController
@RequestMapping("/client")
public class ClientController {

	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value = "/saveClient", method = RequestMethod.GET)
	public void saveClient(@RequestParam String name, @RequestParam String lastname, @RequestParam String sex) {
		
		Client client = new Client(name, lastname, sex);	
		clientService.saveClient(client);
		
	}
	
	@RequestMapping(value = "/getAllClient", method = RequestMethod.GET)
	public List<Client> getAllClient(){
			
		return clientService.getAllClient();
	}
	
	
	@RequestMapping(value = "/getClientBySex", method = RequestMethod.GET)
	public List<Client> getAllClientBySex(@RequestParam String sex){
		
		return clientService.getClientBySex(sex);
	}

	
	

	
}
