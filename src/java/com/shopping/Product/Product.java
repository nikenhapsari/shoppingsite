/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopping.Product;

/**
 *
 * @author nikenhapsari
 */
public class Product {
    private Integer id;
    private String namaBarang;
    private String tentang;
    private Double harga; 

    public Product() {
    }

    public Product(Integer id, String namaBarang, String tentang, Double harga) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.tentang = tentang;
        this.harga = harga;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the tentang
     */
    public String getTentang() {
        return tentang;
    }

    /**
     * @param tentang the tentang to set
     */
    public void setTentang(String tentang) {
        this.tentang = tentang;
    }

    /**
     * @return the harga
     */
    public Double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
}
