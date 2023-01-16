package cadastrocliente;

public class Cliente {
	
	Integer id;
	String nome;
	String email;
	String telefone;
	
	Integer getId() {
		return id;
	}
	void setId(Integer id) {
		this.id = id;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
