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
public class DocumentoContenido
{
	@Id
	private Integer id;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	private Documento documento;

	@Column(nullable = false)
	private String contenido;
}
