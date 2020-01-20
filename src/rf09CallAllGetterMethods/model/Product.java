/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf09CallAllGetterMethods.model;

/**
 *
 * @author Zakaria Ahmmed
 */
public class Product {
    private String productId = "890-870";
    private String productName;
    private String productCat;
    private String productSubCat;
    private String productPrice;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCat() {
        return productCat;
    }

    public void setProductCat(String productCat) {
        this.productCat = productCat;
    }

    public String getProductSubCat() {
        return productSubCat;
    }

    public void setProductSubCat(String productSubCat) {
        this.productSubCat = productSubCat;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", productCat=" + productCat + ", productSubCat=" + productSubCat + ", productPrice=" + productPrice + '}';
    }
    
    
}
