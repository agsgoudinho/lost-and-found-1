package br.edu.utfpr.alunos.lostandfound.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "items")
@Data
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	private Date created;
	private Date updated;

	@Column
	private String descricao;

	@Column
	private String local;

	@Column
	private String horario;

	@Column
	private String data;

	@Column
	private char status;
	
	@OneToOne
	private User usersrecord;
	
	@OneToOne
	private User userfound;
	
	@PreUpdate
	public void onUpdate() {
		this.updated = new Date();
	}

	@PrePersist
	public void onSave() {
		final Date now = new Date();
		this.created = now;
		this.updated = now;
	}
}