package com.fleta.test.util;

import com.fleta.test.url.BaseUrl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class Request extends BaseUrl {

    public ResponseEntity<Map> send(String url, Object param, HttpMethod method) {
        System.out.println(url);
        System.out.println(param);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Cookie", "accessToken=" + token);
        HttpEntity<Object> entity = new HttpEntity<>(param, headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.exchange(
                url,
                method,
                entity,
                Map.class
        );

        return response;
    }
}
