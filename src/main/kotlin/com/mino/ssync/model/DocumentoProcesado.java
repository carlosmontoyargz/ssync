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
public class DocumentoProcesado
{
	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Documento documento;

	@ManyToOne
	private Cliente cliente;
}