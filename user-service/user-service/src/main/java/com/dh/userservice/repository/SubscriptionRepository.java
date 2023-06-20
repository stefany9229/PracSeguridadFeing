package com.dh.userservice.repository;

import com.dh.userservice.model.SubscriptionDTO;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public class SubscriptionRepository {
    private FeignSubscriptionRepository feignSubscriptionRepository;
    public SubscriptionRepository(FeignSubscriptionRepository feignSubscriptionRepository) {
        this.feignSubscriptionRepository = feignSubscriptionRepository;
    }

    public SubscriptionDTO findByUserId(Integer userId){
        ResponseEntity<SubscriptionDTO> response = feignSubscriptionRepository.findByUserId(userId);
        return response.getBody();
    }


}
