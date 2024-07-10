package com.sky.spring.Service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class BasketImpl implements Basket {

    private final Set<Integer> ids = new HashSet<>();


    @Override
    public List<Integer> add(List<Integer> ids) {
        this.ids.addAll(ids);

        return new ArrayList<>(this.ids);
    }

    @Override
    public List<Integer> get() {
        return new ArrayList<>(this.ids);
    }
}
