package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task6 implements Basket {
    HashMap<String, Integer> productCart = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity)
    {
        int productQuantity = productCart.getOrDefault(product, 0);
        productCart.put(product, productQuantity + quantity);
    }

    @Override
    public void removeProduct(String product)
    {
        productCart.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity)
    {
        productCart.put(product, quantity);
    }

    @Override
    public void clear()
    {
        productCart.clear();
    }

    @Override
    public List<String> getProducts()
    {
        List<String> products = new ArrayList<>();
        for(String product : productCart.keySet())
        {
            products.add(product);
        }
        return products;
    }

    @Override
    public int getProductQuantity(String product)
    {
         return productCart.getOrDefault(product, 0);
    }
}

