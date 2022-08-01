package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.Logger;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository

public interface LoggerRepo extends CrudRepository<Logger,Integer> {
}
