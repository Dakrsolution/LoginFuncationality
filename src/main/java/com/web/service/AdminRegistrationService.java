package com.web.service;

import com.web.binding.AdminLoging;
import com.web.entity.AdminRegistration;

public interface AdminRegistrationService {

	AdminRegistration setAdminReg(AdminRegistration ares);

	String login(AdminLoging log);

	//String resetPassword(String tempPwd, String pwd, String confPwd);

	String resetPassword(AdminRegistration adm);

}
