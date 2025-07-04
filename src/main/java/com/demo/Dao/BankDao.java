package com.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.Entity.BankEntity;
import com.demo.Repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository br;

	public String get1(List<BankEntity> b) {
		br.saveAll(b);
		return "Save Successfully";
	}

	public List<String>  get2(String a) {
		return br.get2(a);
	}
	
	

}
