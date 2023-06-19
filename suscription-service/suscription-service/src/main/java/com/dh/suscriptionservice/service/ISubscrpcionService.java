package com.dh.suscriptionservice.service;


import com.dh.suscriptionservice.model.Subscription;

public interface ISubscrpcionService {

     Subscription findSubscriptionByUserId(Integer userId);
}
