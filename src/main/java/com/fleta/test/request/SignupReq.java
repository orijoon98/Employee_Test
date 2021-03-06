package com.fleta.test.request;

import com.fleta.test.param.auth.SignUp;
import com.fleta.test.url.BaseUrl;
import com.fleta.test.util.Request;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@RequiredArgsConstructor
@Component
public class SignupReq extends BaseUrl {
    private final Request request;

    @Value("${signup.url}")
    private String url;

    @Value("${signup.param.loginId}")
    private String loginId;

    @Value("${signup.param.password}")
    private String password;

    @Value("${signup.param.name}")
    private String name;

    @Value("${signup.param.email}")
    private String email;

    public void signup() {

        SignUp signup = SignUp.builder()
                .loginId(loginId)
                .password(password)
                .name(name)
                .email(email)
                .build();

        ResponseEntity<Map> response = request.send(baseUrl + url, signup, HttpMethod.POST);
        System.out.println(response);
    }
}


