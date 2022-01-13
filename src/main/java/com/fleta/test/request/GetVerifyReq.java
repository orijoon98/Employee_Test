package com.fleta.test.request;

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
public class GetVerifyReq extends BaseUrl {
    private final Request request;

    @Value("${getVerify.url}")
    private String url;

    public void getVerify() {

        ResponseEntity<Map> response = request.send(baseUrl + url + uuid, null, HttpMethod.GET);
        System.out.println(response);
    }
}
