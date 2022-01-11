package com.fleta.test.request;

import com.fleta.test.param.auth.SignUp;
import com.fleta.test.url.AuthUrl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RequiredArgsConstructor
public class SignupReq {
    private final AuthUrl authUrl;

    SignUp signUp = SignUp.builder()
            .loginId("admin")
            .password("AAbb12!!")
            .name("admin")
            .email("admin@gmail.com")
            .build();

    public void test() {
        System.out.println(signUp);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<SignUp> entity = new HttpEntity<>(signUp, headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.exchange(
                authUrl.getSignup(),
                HttpMethod.POST,
                entity,
                Map.class
        );

        System.out.println(response.getBody());
    }
}


