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
import java.time.LocalDate;

@Entity
@Table(name = "OutPay_Header")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OutPayHeader {
    @Id
    @Column(name = "Outpay_Header_ID")
    int outpayHeaderId;

    @Column(name = "Clntnum", length = 8, nullable = false)
    String clntnum;

    @Column(name = "Chdrnum", length = 8, nullable = false)
    String chdrnum;

    @Column(name = "LetterType", length = 12, nullable = false)
    String letterType;

    @Column(name = "PrintDate")
    LocalDate printDate;

    @Column(name = "ClntName", length = 80)
    String clntName;

    @Column(name = "ClntAddress", length = 80)
    String clntAddress;

    @Column(name = "RegDate")
    LocalDate regDate;

    @Column(name = "BenPercent",precision = 6, scale = 2)
    @Type(type = "big_decimal")
    double benPercent;

    @Column(name = "Role1", length = 2)
    String role1;

    @Column(name = "Role2", length = 2)
    String role2;

    @Column(name = "CownNum", length = 8)
    String cownNum;

    @Column(name = "CownName", length = 80)
    String cownName;

    @Column(name = "Notice01", length = 80)
    String notice01;

    @Column(name = "Notice02", length = 80)
    String notice02;

    @Column(name = "Notice03", length = 80)
    String notice03;

    @Column(name = "Notice04", length = 80)
    String notice04;

    @Column(name = "Notice05", length = 80)
    String notice05;

    @Column(name = "Notice06", length = 80)
    String notice06;

    @Column(name = "Claim_ID", length = 9)
    String claimId;

    @Column(name = "TP2ProcessDate")
    LocalDate tP2ProcessDate;
}
