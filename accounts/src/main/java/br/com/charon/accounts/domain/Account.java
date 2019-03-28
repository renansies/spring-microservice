package br.com.charon.accounts.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Account {

	@Id
	@GeneratedValue
	@Column
	@Getter
	@Setter
	private Long id;
	
	@Column
	@Getter 
	@Setter
	private String username;
}
