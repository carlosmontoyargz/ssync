package com.mino.ssync.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Carlos Montoya
 * @since 31/10/2019
 */
@Entity
@Data
public class Organizacion
{
	@Id
	@GeneratedValue
	private Integer id;

	@NaturalId
	@Column(length = 4, nullable = false, unique = true)
	private String clave;

	@Column(length = 100)
	private String nombre;

	@CreatedDate
	private LocalDateTime insertado;

	@Column(nullable = false)
	private Boolean activo = false;
}
