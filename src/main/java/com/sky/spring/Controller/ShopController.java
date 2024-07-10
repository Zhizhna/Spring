package com.sky.spring.Controller;

import com.sky.spring.Service.impl.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("store/oder")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService){
        this.shopService = shopService;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam List<Integer> ids){
        return shopService.add(ids);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return shopService.get();
    }
}
