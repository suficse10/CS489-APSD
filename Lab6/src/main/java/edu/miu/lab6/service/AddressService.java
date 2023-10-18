package edu.miu.lab6.service;

import edu.miu.lab6.models.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();

    Address addNewAddress(Address newAddress);

    Address getAddressById(Integer addressId);
}
