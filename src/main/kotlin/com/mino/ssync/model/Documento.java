package com.mino.ssync.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

/**
 * @author Carlos Montoya
 * @since 12/11/2019
 */
@Entity
public class Documento
{
	@Id
	@GeneratedValue
	private Integer id;

	@OneToOne(fetch = LAZY, cascade = ALL, optional = false,
			mappedBy = "documento")
	private DocumentoContenido contenido;

	@Column(length = 100, nullable = false, unique = true)
	private String nombre;

	@Column(length = 5, nullable = false)
	private String extension;

	@Column(length = 5, nullable = false)
	private Long tamano;

	@ManyToOne
	private TipoDocumento tipo;

	@ManyToOne(fetch = LAZY)
	private Centro centro;

	@ManyToOne(fetch = LAZY)
	private ListaPrecio listaPrecio;

	@ManyToOne(fetch = LAZY)
	private Canal canal;

	@CreatedDate
	private LocalDateTime creado;
}
