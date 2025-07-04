package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.BankEntity;
import com.demo.Service.BankService;

@RestController
@RequestMapping(value="/get")
public class BankController {
	@Autowired
	BankService bs;
	
	@PostMapping(value="/get1")
	public String get1(@RequestBody List<BankEntity> b) {
		return bs.get1(b);
	}
	@GetMapping(value="/query/{a}")
	public List<String> get2(@PathVariable String a) {
		return bs.get2(a);
	}
	

}
