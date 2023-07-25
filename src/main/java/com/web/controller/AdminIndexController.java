package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.binding.AdminLoging;
import com.web.entity.AdminRegistration;
import com.web.service.AdminRegistrationService;


@RestController
public class AdminIndexController {

	@Autowired
	private  AdminRegistrationService adminSer;
	
	//for registration
	@PostMapping("/aregister")
	public AdminRegistration setAdminRegistration(@RequestBody AdminRegistration ares)
	{
		
		return adminSer.setAdminReg(ares);
		
	}
	
	
	
	 //for login
		@PostMapping("/alogin")
		public String login(@RequestBody AdminLoging log) {
			return adminSer.login(log);
		}
		
		//for reset password
		@PutMapping("/reset")
		public String resetPwd(@RequestBody AdminRegistration adm)
		{
			return adminSer.resetPassword(adm);
		}
}
