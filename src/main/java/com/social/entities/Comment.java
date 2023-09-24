package com.social.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends AuditModel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String text;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "post_id",nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@JsonIdentityReference(alwaysAsId = true)
@JsonProperty("post_id")
private Post post;




}
