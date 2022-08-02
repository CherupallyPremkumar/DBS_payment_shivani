package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,String> {
}
