package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Dao.BankDao;
import com.demo.Entity.BankEntity;

@Service
public class BankService {
	@Autowired
	BankDao bd;

	public String get1(List<BankEntity> b) {
		return bd.get1(b);
	}

	public List<String>  get2(String a) {
		
		return bd.get2(a);
	}
	
	

}
