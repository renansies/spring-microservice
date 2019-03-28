package br.com.charon.accounts.service;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.charon.accounts.domain.Account;

@Service
public class WebAccountService {

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public WebAccountService(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" +serviceUrl;
	}
	
	public Account getByNumber(String accountNumber) throws AccountNotFoundException {
		Account account = restTemplate.getForObject(serviceUrl + "+accounts/{number}", Account.class, accountNumber);
		
		if (account == null)
			throw new AccountNotFoundException(accountNumber);
		else
			return account;
	}
}
