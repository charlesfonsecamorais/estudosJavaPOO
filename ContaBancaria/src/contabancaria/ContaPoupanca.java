package contabancaria;

public class ContaPoupanca {
	private Integer idConta;
	private Double saldo;
	private String status;
	private Correntista cliente;
	
	Correntista getCliente() {
		return cliente;
	}
	void setCliente(Correntista cliente) {
		this.cliente = cliente;
	}
	Integer getIdConta() {
		return idConta;
	}
	void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	Double getSaldo() {
		return saldo;
	}
	void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}

}
