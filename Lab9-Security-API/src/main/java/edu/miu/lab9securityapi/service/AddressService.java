package edu.miu.lab9securityapi.service;

import edu.miu.lab9securityapi.models.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();

    Address addNewAddress(Address newAddress);

    Address getAddressById(Integer addressId);
}
