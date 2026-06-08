package rafaelandrade.ipurchases.customers.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import rafaelandrade.ipurchases.customers.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
