/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopping.Product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikenhapsari
 */
public class Keranjang {
    private String userName;
    private List<Product> daftarProduct;

    public Keranjang() {
    }

    public Keranjang(String userName) {
        this.userName = userName;
        this.daftarProduct = new ArrayList<Product>();
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the daftarProduct
     */
    public List<Product> getDaftarProduct() {
        return daftarProduct;
    }

    /**
     * @param daftarProduct the daftarProduct to set
     */
    public void setDaftarProduct(List<Product> daftarProduct) {
        this.daftarProduct = daftarProduct;
    }
    
}
