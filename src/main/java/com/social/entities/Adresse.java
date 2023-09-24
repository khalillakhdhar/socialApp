package com.social.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adresse extends AuditModel {
@Column(columnDefinition = "varchar(40) default 'Tunisie'")
private String pays;
private String code_postale;
private String region;
private String rue;
@OneToOne(mappedBy = "adresse")
private Person person;
}
