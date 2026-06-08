package rafaelandrade.ipurchases.customers.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rafaelandrade.ipurchases.customers.entity.Customer;
import rafaelandrade.ipurchases.customers.repository.CustomerRepository;
import rafaelandrade.ipurchases.customers.service.CustomerService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        return ResponseEntity.ok(service.save(customer));
    }

    @GetMapping("/{code}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("code") Long code){
        return service
                .getByCode(code)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
