package com.fleta.test;

import com.fleta.test.request.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TestApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(TestApplication.class, args);

		Scanner sc = new Scanner(System.in);
		String api;

		while(true) {
			api = sc.next();

			switch (api) {
				case "signup":
					try {
						SignupReq signupReq = (SignupReq) applicationContext.getBean("signupReq");
						signupReq.signup();
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				case "login":
					try {
						LoginReq loginReq = (LoginReq) applicationContext.getBean("loginReq");
						loginReq.login();
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				case "verify":
					try {
						VerifyReq verifyReq = (VerifyReq) applicationContext.getBean("verifyReq");
						verifyReq.verify();
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				case "getVerify":
					try {
						GetVerifyReq getVerifyReq = (GetVerifyReq) applicationContext.getBean("getVerifyReq");
						getVerifyReq.getVerify();
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				case "updateUserPublic":
					try {
						UpdateUserPublicReq updateUserPublicReq = (UpdateUserPublicReq) applicationContext.getBean("updateUserPublicReq");
						updateUserPublicReq.updateUserPublic();
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				case "updateUserPrivate":
					try {
						UpdateUserPrivateReq updateUserPrivateReq = (UpdateUserPrivateReq) applicationContext.getBean("updateUserPrivateReq");
						updateUserPrivateReq.updateUserPrivate();
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
			}
		}
	}
}
