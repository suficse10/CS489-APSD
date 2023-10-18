package edu.miu.lab6;

import edu.miu.lab6.models.Address;
import edu.miu.lab6.models.Patient;
import edu.miu.lab6.service.AddressService;
import edu.miu.lab6.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab6Application implements CommandLineRunner {

    private final AddressService addressService;
    private final PatientService patientService;

    public Lab6Application(AddressService addressService, PatientService patientService) {
        this.addressService = addressService;
        this.patientService = patientService;
    }

    public static void main(String[] args) {

        SpringApplication.run(Lab6Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Data Persistence using Spring Data JPA");

        //addNewPatient();
        printALLAddress();
        printAllPatient();
    }

    public Address addNewAddress(String street, String city, String state, String zipCode){
        var newAddress = new Address(null, street, city, state, zipCode, null, null);
        return addressService.addNewAddress(newAddress);
    }

    public void addNewPatient(){
        var patientAddress = addNewAddress("1000 N 4th Street", "Fairfield", "Iowa", "52556");
        var newPatient = new Patient(null, "P001", "Daniel", "Agar", patientAddress, null);
        patientService.addNewPatient(newPatient);
    }

    public void printAllPatient(){
        patientService.getAllPatients().forEach(System.out::println);
    }

    public void printALLAddress(){
        addressService.getAllAddresses().forEach(System.out::println);
    }
}
