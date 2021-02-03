package com.learning.lombooklearnig.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "orders")
@Getter
@Setter
@Builder
@ToString()
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
	private final List<Description> description = new ArrayList<>();
	
	
	public List<Description> addDescriptions(Description desc){
		desc.setOrder(this);
		description.add(desc);
		return description;
	}
	
}
