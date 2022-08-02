package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.TransferType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransfertypeRepo extends CrudRepository<TransferType,String> {
}
