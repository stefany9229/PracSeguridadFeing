package com.dh.suscriptionservice.repository;


import com.dh.suscriptionservice.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlanRepository extends JpaRepository<Plan,Integer> {
}
