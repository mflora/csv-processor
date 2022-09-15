package com.example.systemB.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.SurValues")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SurValues {
    @Id
    int id;

    @Column(name = "chdrnum", length = 8, nullable = false)
    String chdrnum;

    @Column(name = "Survalue", nullable = false, precision = 15, scale = 2)
    @Type(type = "big_decimal")
    double survalue;

    @Column(name = "Company", length = 1, nullable = false)
    String company;

    @Column(name = "Currency", length = 3)
    String currency;

    @Column(name = "ValidDate", length = 10)
    String validDate;
}
