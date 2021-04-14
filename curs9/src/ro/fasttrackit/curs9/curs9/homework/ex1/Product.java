package ro.fasttrackit.curs9.curs9.homework.ex1;

public class Product {
    private int productPrice;
    private int productQuantity;
    private String productName;
    private String productDescription;

    public Product(){


        this.productPrice=productPrice;
        this.productQuantity=productQuantity;
        this.productName=productName;
        this.productDescription=productDescription;

    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}

