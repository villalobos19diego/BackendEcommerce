package com.villalobos19.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.villalobos19.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
