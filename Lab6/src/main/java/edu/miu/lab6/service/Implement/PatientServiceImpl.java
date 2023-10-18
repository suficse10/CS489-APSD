package edu.miu.lab6.service.Implement;

import edu.miu.lab6.models.Patient;
import edu.miu.lab6.repository.PatientRepository;
import edu.miu.lab6.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void addNewPatient(Patient newPatient) {
        patientRepository.save(newPatient);
    }

    @Override
    public Patient getPatientById(Integer patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }
}
