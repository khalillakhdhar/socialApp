package com.social.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person extends AuditModel{
@Column(nullable = false)
private String nom,prenom;
@Email
@Column(nullable = false,unique = true)
private String email;
@Min(value = 10)
@Column(nullable = false)
private int age;
@Temporal(TemporalType.DATE)
private Date birthday;
@Column(nullable = false,length = 15)
private String tel;
@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Gender genre;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "adresse_id")
private Adresse adresse;
@ManyToMany(mappedBy = "persons")
private Set<Groupe> groupes=new HashSet<Groupe>();



}
