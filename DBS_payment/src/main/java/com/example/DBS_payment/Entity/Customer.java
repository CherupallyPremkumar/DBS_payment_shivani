package com.example.DBS_payment.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "customer")
public class Customer  {
    @Id
    private Integer customerId;


    private String accountHolderName;

    private Boolean overDraftFlag;

    private Integer clearBalance;

    private String customerAddress;

    private String customerCity;

    private String customerType;






}
