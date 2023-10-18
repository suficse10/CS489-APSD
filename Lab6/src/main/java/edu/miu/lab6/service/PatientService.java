package edu.miu.lab6.service;

import edu.miu.lab6.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();

    void addNewPatient(Patient newPatient);

    Patient getPatientById(Integer patientId);
}
