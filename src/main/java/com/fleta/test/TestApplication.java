package com.fleta.test;

import com.fleta.test.request.SignupReq;
import com.fleta.test.url.AuthUrl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		AuthUrl authUrl = new AuthUrl();

		SignupReq signupReq = new SignupReq(authUrl);

		signupReq.test();
	}

}
