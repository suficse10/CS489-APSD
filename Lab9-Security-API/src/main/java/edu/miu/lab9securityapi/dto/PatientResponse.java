package edu.miu.lab9securityapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PatientResponse {
    private String patientNo;
    private String firstName;
    private String lastName;
    private AddressResponse address;
}
