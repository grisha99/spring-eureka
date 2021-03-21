package ru.grishchenko.product;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList;

    public List<Product> findAll() {
        return productList;
    }

    @PostConstruct
    private void init() {
        productList = new ArrayList<>();

        productList.add(new Product(1L, "Product 1", 100));
        productList.add(new Product(2L, "Product 2", 200));
        productList.add(new Product(3L, "Product 3", 300));
        productList.add(new Product(4L, "Product 4", 400));
        productList.add(new Product(5L, "Product 5", 500));
    }
}
