package com.codewithmosh.iterator;

public class Main {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();

        productCollection.add(new Product(1,"tea"));
        productCollection.add(new Product(2,"coffee"));

        for (Product product : productCollection)
            System.out.println(product);
    }
}
