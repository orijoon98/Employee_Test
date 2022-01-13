package com.fleta.test.request;

import com.fleta.test.param.user.UpdateUserPublic;
import com.fleta.test.url.BaseUrl;
import com.fleta.test.util.Request;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class UpdateUserPublicReq extends BaseUrl {
    private final Request request;

    @Value("${updateUserPublic.url}")
    private String url;

    @Value("${updateUserPublic.param.country}")
    private String country;

    @Value("${updateUserPublic.param.birthday}")
    private String birthday;

    @Value("${updateUserPublic.param.gender}")
    private String gender;

    @Value("${updateUserPublic.param.zipCode}")
    private String zipCode;

    @Value("${updateUserPublic.param.address}")
    private String address;

    @Value("${updateUserPublic.param.detailAddress}")
    private String detailAddress;

    @Value("${updateUserPublic.param.number}")
    private String number;

    @Value("${updateUserPublic.param.phoneNumber}")
    private String phoneNumber;

    public void updateUserPublic() {

        UpdateUserPublic updateUserPublic = UpdateUserPublic.builder()
                .country(country)
                .birthday(birthday)
                .gender(gender)
                .zipCode(zipCode)
                .address(address)
                .detailAddress(detailAddress)
                .number(number)
                .phoneNumber(phoneNumber)
                .build();

        ResponseEntity<Map> response = request.send(baseUrl + url, updateUserPublic, HttpMethod.PUT);
        System.out.println(response);
    }
}
