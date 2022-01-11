package com.fleta.test.url;

import lombok.Getter;
import lombok.Setter;

@Getter
public class AuthUrl extends BaseUrl {
    @Setter
    private String verifyUrl = "";
    private String signup = baseUrl + "/api/auth/signup";
    private String login = baseUrl + "/api/auth/login";
    private String verify = baseUrl + "/api/auth/verify";
    private String getVerify = baseUrl + "/api/auth/verify/" + verifyUrl;
    private String delete = baseUrl + "/api/auth/delete";
}
