package com.ramoncelestino.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramoncelestino.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
