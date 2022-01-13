package com.fleta.test.request;

import com.fleta.test.param.user.UpdateUserPrivate;
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
public class UpdateUserPrivateReq extends BaseUrl {
    private final Request request;

    @Value("${updateUserPrivate.url}")
    private String url;

    @Value("${updateUserPrivate.param.bank}")
    private String bank;

    @Value("${updateUserPrivate.param.accountNumber}")
    private String accountNumber;

    @Value("${updateUserPrivate.param.accountHolder}")
    private String accountHolder;

    @Value("${updateUserPrivate.param.note}")
    private String note;

    public void updateUserPrivate() {

        UpdateUserPrivate updateUserPrivate = UpdateUserPrivate.builder()
                .bank(bank)
                .accountNumber(accountNumber)
                .accountHolder(accountHolder)
                .note(note)
                .build();

        ResponseEntity<Map> response = request.send(baseUrl + url, updateUserPrivate, HttpMethod.PUT);
        System.out.println(response);
    }
}
