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
@Table(name = "dbo.Policy")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Policy {
    @Id
    @Column(name = "ID")
    int id;

    @Column(name = "Chdrnum", length = 8, nullable = false)
    String chdrnum;

    @Column(name = "Cownnum", length = 8, nullable = false)
    String cownnum;

    @Column(name = "OwnerName", length = 50)
    String ownerName;

    @Column(name = "LifcNum", length = 8)
    String lifcNum;

    @Column(name = "LifcName", length = 50)
    String lifcName;

    @Column(name = "Arcade", length = 3)
    String arcade;

    @Column(name = "Agntnum", length = 3)
    String agntnum;

    @Column(name = "MailAddress", length = 50)
    String mailAddress;
}
