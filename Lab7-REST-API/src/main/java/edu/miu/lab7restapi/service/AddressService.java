package edu.miu.lab7restapi.service;

import edu.miu.lab7restapi.models.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();

    Address addNewAddress(Address newAddress);

    Address getAddressById(Integer addressId);
}
