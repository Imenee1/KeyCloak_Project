package ma.emsi.supplierservice.repositories;

import ma.emsi.supplierservice.entities.Supplier;
import ma.emsi.supplierservice.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
