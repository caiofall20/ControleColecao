package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Usuario {
	@Id
	@SequenceGenerator(name = "usuario_generator", sequenceName = "usuario_sequence", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "usuario_generator" , strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column (nullable = false, length = 50)
	private String nome;
	@Column (nullable = true, length = 50)
	private String cpf;
	@Column (nullable = false, length = 50)
	private String telefone;
	@Column (nullable = false, length = 50)
	private String email;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Column (nullable = false, length = 50)
	private String senha;
}
