package com.github.marcosws.todolist.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "tarefa_tabela")
public class Tarefa implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome_tarefa", length = 256)
	private String nomeTarefa;
	
	@Column(name = "descricao_tarefa", length = 2000)
	private String descricao;
	
	@Column(name = "data_criacao_tarefa")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataCriacao;
	
	@Column(name = "data_modificacao_tarefa")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataModificacao;
	
	@Column(name = "data_finalizacao_tarefa")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataFinalizacao;
	
	@Column(name = "status_tarefa")
	private StatusTipo statusTipo;
	
	@Column(name = "finalizado_tarefa")
	private Boolean finalizado;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public StatusTipo getStatusTipo() {
		return statusTipo;
	}

	public void setStatusTipo(StatusTipo statusTipo) {
		this.statusTipo = statusTipo;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
  
	
    
    
}
