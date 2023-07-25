package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.binding.AdminLoging;
import com.web.entity.AdminRegistration;
import com.web.repository.AdminRegistrationRepository;
import com.web.util.EmailUtils;
import com.web.util.RandomPasswordUtils;
import com.web.util.SessionUtil;



@Service
public class AdminRegistrationServiceImp implements AdminRegistrationService {

	@Autowired
	private  AdminRegistrationRepository repo;

	@Autowired
	private SessionUtil ses;

	@Autowired
	private EmailUtils emailutil;

	@Autowired
	private RandomPasswordUtils randomPwd;

	// for admin registration
	@Override
	public AdminRegistration setAdminReg(AdminRegistration ares) {

		// temp password save in database
		ares.setTempPwd(randomPwd.generateRandomPassword());
		// for sending random password/temp password
		String subject = "Temporary password";
		String body = "<h1>Use your temporary password to reset your password</h1>" + ares.getTempPwd();
		String to = ares.getEmail();
		emailutil.sendEmail(subject, body, to);
		return repo.save(ares);
	}
	
	

	public AdminRegistrationServiceImp(AdminRegistrationRepository repo, SessionUtil ses, EmailUtils emailutil,
			RandomPasswordUtils randomPwd) {
		super();
		this.repo = repo;
		this.ses = ses;
		this.emailutil = emailutil;
		this.randomPwd = randomPwd;
	}



	// for admin login
	@Override
	public String login(AdminLoging log) {
		String temp = "";
		if ((repo.findByPhno(log.getPhno()).isPresent() || repo.findByEmail(log.getEmail()).isPresent())) {

			if (repo.findByPwd(log.getPwd()).isPresent()) {
				String sessionId = ses.generateSessionId();
				ses.userSessions.add(sessionId);
				temp = "Login successful....";
			} else {
				temp = "invalid password...";
			}

		} else {
			temp = "Invalid Email Id or Phno";
		}
		return temp;

	}

	// for reset pwd

//	@Override
//	public String resetPassword(String tempPwd, String pwd, String confPwd) {
//		
//		String temp = "";
//		if (tempPwd.equals(reg.getTempPwd())) {
//			
//			return "your password is reset successfully....";
//		} else {
//			temp = "invalid temporary password";
//		}
//		return temp;
//	}

	@Override
	public String resetPassword(AdminRegistration adm) {
		String temp="";
//		AdminRegistration reg = new AdminRegistration();
//		reg.setPwd(pwd);
//		reg.setConfPwd(confPwd);
		repo.save(adm);
		return "reset password";
	}

}
