package iibdcc.enset.inventoryservice.repositories;

import iibdcc.enset.inventoryservice.entities.Product;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
