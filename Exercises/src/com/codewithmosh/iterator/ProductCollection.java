package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCollection implements Iterable<Product>{
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  @Override
  public Iterator iterator() {
    return new ProductIterator();
  }

  private class ProductIterator implements Iterator<Product>{
    private int index;

    @Override
    public boolean hasNext() {
      return index < products.size();
    }

    @Override
    public Product next() {
      return products.get(index++);
    }
  }
}
