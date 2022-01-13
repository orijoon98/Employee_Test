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
public class VerifyReq extends BaseUrl {
    private final Request request;

    @Value("${verify.url}")
    private String url;

    public void verify() {

        ResponseEntity<Map> response = request.send(baseUrl + url, null, HttpMethod.POST);
        uuid = response.getBody().get("data").toString();
        System.out.println(response);
    }
}
