package com.mino.ssync.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * @author Carlos Montoya
 * @since 12/11/2019
 */
@Entity
@Data
public class Documento
{
	@Id
	private Integer id;

	@OneToOne(mappedBy = "documento", optional = false,
			fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private DocumentoDetalle detalle;

	@Column(nullable = false)
	private String contenido;
}
