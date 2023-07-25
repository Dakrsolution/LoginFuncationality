package com.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.AdminRegistration;
@Repository
public interface AdminRegistrationRepository extends JpaRepository<AdminRegistration, Integer>{

	Optional<AdminRegistration> findByPhno(Long phno);

	Optional<AdminRegistration> findByPwd(String pwd);
	Optional<AdminRegistration> findByEmail(String email);

}
