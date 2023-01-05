package com.test.ordermanagementsystem.converter;

import com.test.ordermanagementsystem.dto.OrdersDTO;
import com.test.ordermanagementsystem.entity.Orders;
import org.springframework.stereotype.Service;

@Service
public class OrdersDtoToEntity {

    public Orders dtoToEntity(OrdersDTO ordersDTO) {

    Orders orders =
        Orders.builder()
            .id(ordersDTO.getId())
            .customerId(ordersDTO.getCustomerId())
            .customerName(ordersDTO.getCustomerName())
            .deliveryAddress(ordersDTO.getDeliveryAddress())
            .orderTotal(ordersDTO.getOrderTotal())
            .deliveryCharge(ordersDTO.getDeliveryCharge())
            .discountAmmount(ordersDTO.getDiscountAmount())
            .productPrice(ordersDTO.getProductPrice())
            .customerType(ordersDTO.getCustomerType())
            .deleted(ordersDTO.getDeleted())
            .build();

        return orders;
    }
}
