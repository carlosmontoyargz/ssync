package com.mino.ssync.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

/**
 * @author Carlos Montoya
 * @since 12/11/2019
 */
@Entity
@Data
public class Preprocesado
{
	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private DocumentoContenido documentoContenido;

	@ManyToOne
	private Cliente cliente;
}
