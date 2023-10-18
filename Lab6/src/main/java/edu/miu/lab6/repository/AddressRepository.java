package edu.miu.lab6.repository;

import edu.miu.lab6.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
