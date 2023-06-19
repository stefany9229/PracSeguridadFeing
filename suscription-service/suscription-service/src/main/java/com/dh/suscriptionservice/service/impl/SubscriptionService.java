package com.dh.suscriptionservice.service.impl;

import com.dh.suscriptionservice.model.Subscription;
import com.dh.suscriptionservice.repository.ISubscriptionRepository;
import com.dh.suscriptionservice.service.ISubscrpcionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService implements ISubscrpcionService {
    private ISubscriptionRepository subscriptionRepository;

    public SubscriptionService(ISubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public Subscription findSubscriptionByUserId(Integer userId){
        return subscriptionRepository.findByUserId(userId);
    }
}
