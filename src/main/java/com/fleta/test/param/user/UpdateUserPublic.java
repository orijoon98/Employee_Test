package com.fleta.test.param.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@ToString
public class UpdateUserPublic {
    private String country;
    private LocalDate birthday;
    private String gender;
    private String zipCode;
    private String address;
    private String detailAddress;
    private String number;
    private String phoneNumber;

    @Builder
    public UpdateUserPublic(String country, LocalDate birthday, String gender, String zipCode, String address, String detailAddress, String number, String phoneNumber) {
        this.country = country;
        this.birthday = birthday;
        this.gender = gender;
        this.zipCode = zipCode;
        this.address = address;
        this.detailAddress = detailAddress;
        this.number = number;
        this.phoneNumber = phoneNumber;
    }
}
