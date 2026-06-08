package rafaelandrade.ipurchases.customers.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rafaelandrade.ipurchases.customers.entity.Customer;
import rafaelandrade.ipurchases.customers.repository.CustomerRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public Customer save(Customer customer){
        return repository.save(customer);
    }

    public Optional<Customer> getByCode(Long code){
        return repository.findById(code);
    }
}
