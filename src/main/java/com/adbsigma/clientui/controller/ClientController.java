package com.adbsigma.clientui.controller;

import com.adbsigma.clientui.beans.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.adbsigma.clientui.proxies.ProductsManagementProxy;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ProductsManagementProxy ProductsProxy;

    @RequestMapping("/")
    public String accueil(Model model){

        List<ProductBean> products = ProductsProxy.productList();
        model.addAttribute("products", products);

        return "Accueil";
    }

    @RequestMapping("/product/details/{id}")
    public String productDetails(@PathVariable int id, Model model){
        ProductBean product = ProductsProxy.displayProduct(id);
        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
