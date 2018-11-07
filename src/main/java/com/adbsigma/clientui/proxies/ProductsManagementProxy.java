package com.adbsigma.clientui.proxies;

import com.adbsigma.clientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "products-management", url = "localhost:9001")
public interface ProductsManagementProxy {

    @GetMapping(value="/Products")
    public List<ProductBean> productList();

    @GetMapping(value="/Products/{id}")
    public ProductBean displayProduct(@PathVariable("id") int id);
}