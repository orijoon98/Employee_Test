package com.fleta.test.param.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Login {
    private String loginId;
    private String password;

    @Builder
    public Login(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }
}
