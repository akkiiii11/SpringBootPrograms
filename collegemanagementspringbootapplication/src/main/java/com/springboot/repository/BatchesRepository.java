package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Batches;

public interface BatchesRepository extends JpaRepository<Batches, Integer>
{

}