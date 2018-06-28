package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Carrinho {
	
	@Id
	@SequenceGenerator(name = "carrinho_generator", sequenceName = "carrinho_sequence", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "carrinho_generator" , strategy = GenerationType.SEQUENCE)
	private long id;
	@Column(nullable = false, length = 50)
	private String marca;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColecao() {
		return colecao;
	}
	public void setColecao(String colecao) {
		this.colecao = colecao;
	}
	public float getEscala() {
		return escala;
	}
	public void setEscala(float escala) {
		this.escala = escala;
	}
	@Column(nullable = false, length = 50)
	private String modelo;
	@Column(nullable = false, length = 50)
	private String colecao;
	@Column(nullable = false, length = 50)
	private float escala;
	@Column(nullable = false, length = 50)
	private Integer ano;
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
}
