package com.example.demo.DAO;

import com.example.demo.model.Account;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<Account, String> {

	@Query("select DISTINCT ar.account from Authority ar where ar.role.id IN ('DIRE','STAF')")
	List<Account> getdministrators();
}
