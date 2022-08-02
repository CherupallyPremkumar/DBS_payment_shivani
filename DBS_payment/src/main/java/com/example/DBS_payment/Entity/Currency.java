package com.example.DBS_payment.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Currency")
public class Currency {
    @Id
    private String currencyCode;
    @Column(length = 100)
    private String currencyName;

    private Integer conversionrate;
}
