package com.dh.suscriptionservice.controllers;


import com.dh.suscriptionservice.model.Subscription;
import com.dh.suscriptionservice.service.ISubscrpcionService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/subscription")
public class SubscriptionRestController {

    private ISubscrpcionService subscriptionService;

    @Value("${server.port}")
    private int serverPort;

    public SubscriptionRestController(ISubscrpcionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping("/find/{userId}")
    public Subscription findSubscriptionByUser(@RequestParam Integer userId){


        return subscriptionService.findSubscriptionByUserId(userId);
    }

}
