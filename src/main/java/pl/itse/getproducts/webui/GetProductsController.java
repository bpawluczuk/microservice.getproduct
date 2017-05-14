package pl.itse.getproducts.webui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.itse.getproducts.domain.Product;
import pl.itse.getproducts.service.ProductService;

import java.util.List;

/**
 * Created by Borys on 2017-05-08.
 */
@RestController
public class GetProductsController {

    ProductService productService;

    @Autowired
    public GetProductsController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public List<Product> products() {
        return productService.findAll();
    }
}
