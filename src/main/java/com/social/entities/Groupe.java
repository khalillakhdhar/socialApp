package com.social.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Groupe extends AuditModel {

	@Column(nullable = false,unique = true)
	private String groupename;
	private String description;
	@OneToOne(cascade = CascadeType.ALL)
	private Person createur;
	@ManyToMany
	@JoinTable(
			name = "user_group",
			joinColumns = @JoinColumn(name="groupe_id"),
			inverseJoinColumns=@JoinColumn(name="person_id")
			)
	
	private Set<Person> persons=new HashSet<Person>();	
	
	
	
}
