package com.vg.CICDDemo.CICDdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicDdemoApplication {


	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome VG";
	}

	/**
	 * 4656333
	 * git init
	 * git add README.md
	 * git commit -m "first commit"
	 * git branch -M main
	 * git remote add origin https://github.com/viraag/github-actions-example2.git
	 * git push -u origin main
	 */
	public static void main(String[] args) {
		SpringApplication.run(CicDdemoApplication.class, args);
	}

}
