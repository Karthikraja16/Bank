package com.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.Entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Integer>{

	@Query(value="select p.name from BankEntity p where p.IfscCode=?1")
	List<String>  get2(String a);

	

}
