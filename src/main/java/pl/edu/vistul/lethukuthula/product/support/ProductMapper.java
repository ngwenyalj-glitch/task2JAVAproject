package pl.edu.vistul.lethukuthula.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistul.lethukuthula.product.api.request.ProductRequest;
import pl.edu.vistul.lethukuthula.product.api.request.UpdateProductRequest;
import pl.edu.vistul.lethukuthula.product.api.response.ProductResponse;
import pl.edu.vistul.lethukuthula.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}