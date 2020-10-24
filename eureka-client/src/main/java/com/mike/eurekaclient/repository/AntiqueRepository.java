package com.mike.eurekaclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mike.eurekaclient.entity.Antique;

public interface AntiqueRepository extends JpaRepository<Antique, Integer> {

}
