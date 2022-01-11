package com.fleta.test.url;

import lombok.Getter;

@Getter
public class UserUrl extends BaseUrl {
    private String updateUserPublic = baseUrl + "/api/user/public";
    private String updateUserPrivate = baseUrl + "/api/user/private";
}
