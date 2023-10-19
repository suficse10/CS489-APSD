package edu.miu.lab7restapi.repository;

import edu.miu.lab7restapi.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
