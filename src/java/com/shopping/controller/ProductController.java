/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopping.controller;

import com.shopping.Product.Keranjang;
import com.shopping.Product.Product;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author nikenhapsari
 */

@Controller
@RequestMapping("/detail")
public class ProductController {
     @RequestMapping(value="/{id}")
    public String getDetail(HttpSession session,@PathVariable("id") Integer id, Model model) {
        List<Product> p = (List<Product>) session.getAttribute("daftar");
        Product pr = null; 
        for (Product product : p) {
             if(id==product.getId()){
                 pr=product;
             }
         }
        session.setAttribute("detailproduk", pr);
        return "detail";
    }
    @RequestMapping(value="/tambahkan")
    public String keranjang(HttpSession session, Model model) {
        List<Product> p = (List<Product>) session.getAttribute("keranjang");
        p.add((Product) session.getAttribute("detailproduk"));
        session.removeAttribute("detailproduk");
        return "tambah";
    }
}
