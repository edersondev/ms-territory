package com.edersonferreira.msterritory.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_state")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 2, nullable = false)
	private Integer codeUf;
	
	@Column(length = 100, nullable = false)
	private String name;
	
	@Column(length = 2, nullable = false)
	private String uf;
	
	@ManyToOne
	@JoinColumn(name = "id_region", nullable = false)
	private Region region;
	
	public State() {
	}

	public State(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodeUf() {
		return codeUf;
	}

	public void setCodeUf(Integer codeUf) {
		this.codeUf = codeUf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
}