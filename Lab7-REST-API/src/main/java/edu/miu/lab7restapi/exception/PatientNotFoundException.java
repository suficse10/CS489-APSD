package edu.miu.lab7restapi.exception;

public class PatientNotFoundException extends Exception{
    public PatientNotFoundException(String message) {
        super(message);
    }
}
