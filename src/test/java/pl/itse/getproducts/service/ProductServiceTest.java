package pl.itse.getproducts.service;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import pl.itse.getproducts.domain.Product;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Borys on 2017-05-16.
 */
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    public void findAllTest() throws Exception {

        List<Product> products = new ArrayList<Product>();
        assertEquals(products, products);
    }

    @Test
    public void productService() {

        Product product = new Product("product name", Product.ProductType.EQUIPMENT);
        List<Product> products = new ArrayList<Product>();
        products.add(product);

        ProductService productService = Mockito.mock(ProductService.class);
        when(productService.findAll()).thenReturn(products);
        System.out.println(productService.findAll());
    }

    public class ProductService {

        public List<Product> findAll() {
            return null;
        }
    }

}