package com.bankapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//I have declare the dao layer
@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{

	public Account findByName(String name);//spring data will provide the impl :)
}
