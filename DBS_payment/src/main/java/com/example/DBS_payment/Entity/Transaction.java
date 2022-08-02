package com.example.DBS_payment.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
public class Transaction {
    @Id
    private Integer transactionId;
    @OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customer_id")
    private List<Customer> customerId;
    private String currencyCode;
    @OneToOne(targetEntity = Bank.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_sender_Bic")
    private Bank senderBic;
    @OneToOne(targetEntity = Bank.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_receiver_Bic")
    private Bank receiverBic;

    private String receiverAccountHoldernumber;

    private  String receiverAccountHolderName;
    @OneToOne(targetEntity = TransferType.class, cascade = CascadeType.ALL)
   @JoinColumn(name = "fk_transferTypeCode")
    private TransferType transferTypeCode;
    @OneToOne(targetEntity = Message.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_messageCode")
    private Message messageCode;

    private Integer currencyAmount;
    private  Integer transferFees;
    private Integer inrAmount;
    private Date transferDate;



}
