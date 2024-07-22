package com.nagoorkhan.orderservice.model.request;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRequestVO {
    private String orderNum;
    private List<OrderLineItemsRequestVO> orderLineItems;
}
