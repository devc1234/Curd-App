package com.dev.CurdApp;

import com.dev.CurdApp.model.Employe;
import com.dev.CurdApp.repo.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurdAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CurdAppApplication.class, args);
	}

	@Autowired
	EmployeRepo employeRepo;

	@Override
	public void run(String... args) throws Exception {
		Employe employe =new Employe();
		employe.setId(2);
		employe.setFirstname("sneha");
		employe.setLastName("chavan");
		employe.setEmailId("sneha@gmail.com");
		employeRepo.save(employe);

		Employe employe1 = new Employe();
		employe1.setId(1);
		employe1.setFirstname("dev");
		employe1.setLastName("chavan");
		employe1.setEmailId("devgmail.com");
		employeRepo.save(employe1);
	}
}
