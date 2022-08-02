package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends CrudRepository<Message,String> {
}
