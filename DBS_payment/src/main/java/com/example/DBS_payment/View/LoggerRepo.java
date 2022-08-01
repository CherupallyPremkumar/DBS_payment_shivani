package com.example.DBS_payment.View;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepo extends CrudRepository<LoggerRepo,Integer> {
}
