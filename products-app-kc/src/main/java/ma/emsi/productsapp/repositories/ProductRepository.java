package ma.emsi.productsapp.repositories;

import ma.emsi.productsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
