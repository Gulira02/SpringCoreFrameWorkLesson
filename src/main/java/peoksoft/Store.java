package peoksoft;

import lombok.*;

import java.util.List;

@Getter
@ToString
public class Store {
 private Products products;
 private List<Products>products1;
 private String storeName;
 private int priceProducts;

    public Store(String storeName, int priceProducts) {
        this.storeName = storeName;
        this.priceProducts = priceProducts;
    }

    public Store(List<Products> products1, String storeName, int priceProducts) {
        this.products1 = products1;
        this.storeName = storeName;
        this.priceProducts = priceProducts;
    }

    public Store(List<Products> products1) {
        this.products1 = products1;
    }

    public List<Products> getProducts1() {
        return products1;
    }

    public void setProducts1(List<Products> products1) {
        this.products1 = products1;
    }

    public Store(){}

    public Store(Products products, String storeName, int priceProducts) {
        this.products = products;
        this.storeName = storeName;
        this.priceProducts = priceProducts;
    }

    public Store(Products products) {
        this.products = products;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setPriceProducts(int priceProducts) {
        this.priceProducts = priceProducts;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public void callYourProducts(){
        products.description();
        System.out.println("Hello my lovely Products! ");
    }



}
