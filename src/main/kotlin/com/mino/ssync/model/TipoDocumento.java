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
public class TipoDocumento
{
	@Id
	@GeneratedValue
	private Integer id;

	@NaturalId
	@Column(length = 50, nullable = false, unique = true)
	private String clave;

	@ManyToOne
	private String descripcion;

	@Enumerated(EnumType.STRING)
	private SentidoDocumento sentido;

	@CreatedDate
	private LocalDateTime creado;

	@Column(nullable = false)
	private Boolean activo = true;
}
