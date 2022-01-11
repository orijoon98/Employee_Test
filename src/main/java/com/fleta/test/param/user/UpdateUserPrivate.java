package com.fleta.test.param.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class UpdateUserPrivate {
    private String bank;
    private String accountNumber;
    private String accountHolder;
    private String note;

    @Builder
    public UpdateUserPrivate(String bank, String accountNumber, String accountHolder, String note) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.note = note;
    }
}
