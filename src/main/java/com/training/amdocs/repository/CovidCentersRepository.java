package com.training.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.amdocs.entity.CovidCenters;

public interface CovidCentersRepository extends JpaRepository<CovidCenters, String> {

}
