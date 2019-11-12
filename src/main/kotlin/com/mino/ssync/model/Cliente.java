package com.mino.ssync.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Montoya
 * @since 31/10/2019
 */
@Entity
@Data
public class Cliente
{
	@Id
	@GeneratedValue
	private Integer id;

	@NaturalId
	@Column(length = 100, nullable = false, unique = true)
	private String usuario;

	@Column(length = 100)
	private String password;

	@ManyToMany
	@JoinTable(name = "cliente_centro",
			joinColumns = @JoinColumn(name = "organizacion_id"),
			inverseJoinColumns = @JoinColumn(name = "centro_id"))
	private List<Centro> centro = new ArrayList<>();

	@CreatedDate
	private LocalDateTime insertado;

	@Column(nullable = false)
	private Boolean activo = false;
}
