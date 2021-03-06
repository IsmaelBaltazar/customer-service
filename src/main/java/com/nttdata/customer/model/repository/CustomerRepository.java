package com.nttdata.customer.model.repository;

import com.nttdata.customer.model.document.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer, Long> {
}
