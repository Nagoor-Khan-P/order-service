package com.nagoorkhan.orderservice.controller;

import com.nagoorkhan.orderservice.model.business.OrderVO;
import com.nagoorkhan.orderservice.model.request.OrderRequestVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    public void get() {
        OrderRequestVO or = new OrderRequestVO();
        or.getOrderLineItems();
    }
}
