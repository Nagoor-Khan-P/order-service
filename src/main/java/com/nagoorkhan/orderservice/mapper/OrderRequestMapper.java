package com.nagoorkhan.orderservice.mapper;

import com.nagoorkhan.orderservice.model.business.OrderVO;
import com.nagoorkhan.orderservice.model.request.OrderRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {OrderLineItemsRequestMapper.class})
public interface OrderRequestMapper {

    @Mapping(source = "orderLineItems", target = "orderLineItemVOS")
    OrderVO orderRequestVOToOrderVO(OrderRequestVO orderRequestVO);
}
