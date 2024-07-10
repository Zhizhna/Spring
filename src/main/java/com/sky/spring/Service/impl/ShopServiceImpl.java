package com.sky.spring.Service.impl;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    private final Basket basket;

    public ShopServiceImpl(Basket basket) {
        this.basket = basket;
    }
    @Override
    public List<Integer> add(List<Integer> ids){
        return basket.add(ids);
    }

    @Override
    public List<Integer> get(){
        return basket.get();
    }
}

