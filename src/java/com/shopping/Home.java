/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopping;

import com.shopping.Product.Keranjang;
import com.shopping.Product.Product;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nikenhapsari
 */
@Controller
@RequestMapping("/home")
public class Home {

    List<Product> keranjang = new ArrayList<Product>();
    
    @RequestMapping()
    public String home(HttpSession session, Model model) {
//        Keranjang cart = new Keranjang("Niken");
        List<Product> daftar = new ArrayList<Product>();
        Product produk1 = new Product(1, "Iphone X", "Ini Iphone keluaran terbaru loh!", 10000000.0);
        Product produk2 = new Product(2, "ASUS ROG", "Laptop spesial buat para gamers nih!", 20000000.0);
        daftar.add(produk1);
        daftar.add(produk2);
        model.addAttribute("msg", "HALAMAN UTAMA NIKEN SHOP");
        session.setAttribute("daftar",daftar);
        session.setAttribute("keranjang", keranjang);
        return "home";
    }
}
