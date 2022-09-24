package com.example.addToCart.Service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name="product-metadata", url="localhost:8082")
public interface ProductDetailsProxy {

}
