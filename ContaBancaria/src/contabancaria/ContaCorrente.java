package contabancaria;

public class ContaCorrente{
	
	private Integer idConta;
	private Double saldo;
	private String status;
	private Correntista cliente;
	
	Integer getIdConta() {
		return idConta;
	}
	Correntista getCliente() {
		return cliente;
	}
	void setCliente(Correntista cliente) {
		this.cliente = cliente;
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
