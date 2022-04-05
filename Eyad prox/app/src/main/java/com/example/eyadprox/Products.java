package com.example.eyadprox;

public class Products implements java.io.Serializable{
    String ProductName;
    String ProductPrice;
    String ProductScreenSize;
    String ProductRAM;
    String ProductROM;
    String ProductSoft;
    String ProductBrand;
    String ProductCamRes;
    String PoductScreenRes;
    int ProductImage;

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductScreenSize() {
        return ProductScreenSize;
    }

    public void setProductScreenSize(String productScreenSize) {
        ProductScreenSize = productScreenSize;
    }

    public String getProductRAM() {
        return ProductRAM;
    }

    public void setProductRAM(String productRAM) {
        ProductRAM = productRAM;
    }

    public String getProductROM() {
        return ProductROM;
    }

    public void setProductROM(String productROM) {
        ProductROM = productROM;
    }

    public String getProductSoft() {
        return ProductSoft;
    }

    public void setProductSoft(String productSoft) {
        ProductSoft = productSoft;
    }

    public String getProductBrand() {
        return ProductBrand;
    }

    public void setProductBrand(String productBrand) {
        ProductBrand = productBrand;
    }

    public String getProductCamRes() {
        return ProductCamRes;
    }

    public void setProductCamRes(String productCamRes) {
        ProductCamRes = productCamRes;
    }

    public String getPoductScreenRes() {
        return PoductScreenRes;
    }

    public void setPoductScreenRes(String poductScreenRes) {
        PoductScreenRes = poductScreenRes;
    }

    public int getProductImage() {
        return ProductImage;
    }

    public void setProductImage(int productImage) {
        ProductImage = productImage;
    }

    public Products(String productName, String productPrice, String productScreenSize, String productRAM, String productROM, String productSoft, String productBrand, String productCamRes, String poductScreenRes, int productImage) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductScreenSize = productScreenSize;
        ProductRAM = productRAM;
        ProductROM = productROM;
        ProductSoft = productSoft;
        ProductBrand = productBrand;
        ProductCamRes = productCamRes;
        PoductScreenRes = poductScreenRes;
        ProductImage = productImage;


    }
}
