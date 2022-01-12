package com.fleta.test.request;

import com.fleta.test.param.auth.Login;
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
public class LoginReq extends BaseUrl {
    private final Request request;


    @Value("${login.url}")
    private String url;

    @Value("${login.param.loginId}")
    private String loginId;

    @Value("${login.param.password}")
    private String password;

    public void login() {

        Login login = Login.builder()
                .loginId(loginId)
                .password(password)
                .build();

        ResponseEntity<Map> response = request.send(baseUrl + url, login, HttpMethod.POST);
        System.out.println(response);
    }
}
