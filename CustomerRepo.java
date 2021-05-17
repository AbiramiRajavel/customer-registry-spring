package com.example.Customercarereport;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerHelper , Long> {

}
