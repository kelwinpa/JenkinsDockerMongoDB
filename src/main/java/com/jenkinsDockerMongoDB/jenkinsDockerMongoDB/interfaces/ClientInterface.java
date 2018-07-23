package com.jenkinsDockerMongoDB.jenkinsDockerMongoDB.interfaces;

import java.util.List;

import com.jenkinsDockerMongoDB.jenkinsDockerMongoDB.entity.Client;

public interface ClientInterface {

	public void saveClient(Client client);
	public List<Client> getAllClient();
	public List<Client> getClientBySex(String sex);
	
}
