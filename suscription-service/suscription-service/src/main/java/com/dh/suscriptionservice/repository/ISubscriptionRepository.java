package com.dh.suscriptionservice.repository;


import com.dh.suscriptionservice.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ISubscriptionRepository extends JpaRepository<Subscription,Integer> {

    Subscription findByUserId(Integer userId);
}
