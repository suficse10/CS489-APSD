package edu.miu.lab7restapi.service;

import edu.miu.lab7restapi.dto.PatientResponse;
import edu.miu.lab7restapi.models.Patient;

import java.util.List;

public interface PatientService {
    List<PatientResponse> getAllPatients();

    Patient addNewPatient(Patient newPatient);

    Patient getPatientById(Integer patientId);

    Patient updatePatientById(Integer patientId, Patient editedPatient);

    void deletePatientById(Integer patientId);

    List<Patient> searchPatient(String searchString);
}
