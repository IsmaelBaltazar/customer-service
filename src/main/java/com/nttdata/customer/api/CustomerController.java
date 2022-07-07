package com.nttdata.customer.api;

import com.nttdata.customer.model.document.Customer;
import com.nttdata.customer.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Mono<Customer> register(@RequestBody Customer customer){
        return customerService.save(customer);
    }
    @GetMapping
    public Flux<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{idCustomer}")
    public Mono<Customer> getOne(@PathVariable Long idCustomer){
        return customerService.findById(idCustomer);
    }
    @PutMapping
    public Mono<Customer> update(@RequestBody Customer customer){
        return  customerService.update(customer);
    }
}
