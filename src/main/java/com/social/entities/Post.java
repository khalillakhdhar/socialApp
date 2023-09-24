package com.social.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post extends AuditModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Lob
	private String content;
	@Column(unique = true)
	private String title;
	private String description;
	@OneToMany(mappedBy = "post",fetch = FetchType.LAZY)
	
	private List<Comment> comments=new ArrayList<Comment>();
	

}
