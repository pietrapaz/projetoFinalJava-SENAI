package br.com.senaibrasilia.projetofinal.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// classe de mapeamento da tabela
// uma classe de Entidade

// anotação diferente de comentário
// CREATE TABLE PRODUTO
@Entity
@Table(name="produtos")
public class Produto {
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	
	@ManyToOne
	private Categoria categoria;
	
	public Produto() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Produto(String nome, String descricao, BigDecimal preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	
}
