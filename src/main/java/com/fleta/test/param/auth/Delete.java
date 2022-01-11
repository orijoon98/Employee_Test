package com.fleta.test.param.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Delete {
    private String loginId;

    @Builder
    public Delete(String loginId) {
        this.loginId = loginId;
    }
}
