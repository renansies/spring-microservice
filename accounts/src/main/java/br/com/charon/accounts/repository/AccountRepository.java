package br.com.charon.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.charon.accounts.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
