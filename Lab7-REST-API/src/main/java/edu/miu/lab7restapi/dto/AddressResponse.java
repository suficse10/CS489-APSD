package edu.miu.lab7restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddressResponse {
    private String street;
    private String city;
    private String state;
    private String zipCode;
}
