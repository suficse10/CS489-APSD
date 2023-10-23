package edu.miu.lab9securityapi.repository;

import edu.miu.lab9securityapi.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
