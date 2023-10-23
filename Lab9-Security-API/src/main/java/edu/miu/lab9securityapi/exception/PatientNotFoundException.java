package edu.miu.lab9securityapi.exception;

public class PatientNotFoundException extends Exception{
    public PatientNotFoundException(String message) {
        super(message);
    }
}
