package com.epicode.model;

public class User {
	private Long id;
	private String nome;
	private String cognome;
	private Integer anni;
	private String email;
	
	public User( String nome, String cognome, Integer anni, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
		this.email = email;
	}
	public User(Long id, String nome, String cognome, Integer anni, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
		this.email = email;
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
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Integer getAnni() {
		return anni;
	}
	public void setAnni(Integer anni) {
		this.anni = anni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", anni=" + anni + ", email=" + email
				+ "]";
	}
	
	
	


}

