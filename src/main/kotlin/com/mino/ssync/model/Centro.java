package com.mino.ssync.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Carlos Montoya
 * @since 31/10/2019
 */
@Entity
@Data
public class Centro
{
	@Id
	@GeneratedValue
	private Integer id;

	@NaturalId
	@Column(length = 4, nullable = false, unique = true)
	private String clave;

	@Column(length = 100)
	private String nombre;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Organizacion organizacion;

	@ManyToMany
	@JoinTable(name = "centro_lista",
			joinColumns = @JoinColumn(name = "centro_id"),
			inverseJoinColumns = @JoinColumn(name = "lista_id"))
	private List<ListaPrecio> listasPrecio = new ArrayList<>();

	@CreatedDate
	private LocalDateTime insertado;

	@Column(nullable = false)
	private Boolean activo = false;
}
