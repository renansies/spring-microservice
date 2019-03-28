package br.com.charon.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import br.com.charon.accounts.repository.AccountRepository;

@EnableAutoConfiguration
@EnableEurekaClient
//@Import(AccountsWebApplication.class)
public class AccountsApplication {
	
	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "accounts-server");
		SpringApplication.run(AccountsApplication.class, args);
	}

}
