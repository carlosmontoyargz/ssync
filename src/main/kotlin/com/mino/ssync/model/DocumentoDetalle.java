package com.mino.ssync.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Carlos Montoya
 * @since 12/11/2019
 */
@Entity
public class DocumentoDetalle
{
	@Id
	@GeneratedValue
	private Integer id;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	private Documento documento;

	@Column(length = 100, nullable = false, unique = true)
	private String nombre;

	@Column(length = 5, nullable = false)
	private String extension;

	@Column(length = 5, nullable = false)
	private Long tamano;

	@ManyToOne
	private TipoDocumento tipo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Centro centro;

	@ManyToOne(fetch = FetchType.LAZY)
	private ListaPrecio listaPrecio;

	@ManyToOne(fetch = FetchType.LAZY)
	private Canal canal;

	@CreatedDate
	private LocalDateTime insertado;

	@Column(nullable = false)
	private Boolean activo = false;
}
