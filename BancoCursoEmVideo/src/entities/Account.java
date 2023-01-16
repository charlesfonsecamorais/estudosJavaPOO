package entities;

public class Account {
	
	private Integer number;
	private char type;
	private String owner;
	private Double balance;
	private Boolean status;
	
	public Account(Integer number, char type, String owner, Double balance, Boolean status) {
		this.number = number;
		this.type = type;
		this.owner = owner;
		balance = 0.0;
		status = false;
	}
	
	public Account(Integer number, char type, String owner) {
		super();
		this.number = number;
		this.type = type;
		this.owner = owner;
		balance = 0.0;
		status = false;
	}


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	

	public void openAccount(char type) {
		if (type == 'C') {
			balance += 50.0;
			status = true;
		}
		
		if (type == 'P') {
			balance += 150.00;
			status = true;
		}
	}
	
	public static Double checkBalance(Integer number, Double balance) {
		return balance;
	}
	
	public static Double deposit(Double balance, Double value) {
		return balance += value;
	}
	
	public static Double withDraw(Double balance, Double value) {
		return balance -= value;
	}
	
	public void closeAccount(Double balance) {
		if (balance > 0.0) {
			System.out.printf("Voce precisa sacar R$ %.2f antes de encerrar sua conta!", balance );
		} else if(balance < 0.0) {
			System.out.printf("Voce precisa pagar R$ %.2f para encerrar sua conta!", balance * -1 );
		} else {
			System.out.println("Conta encerrada com sucesso!");
			status = false;
		}
	}
	
	public static void taxation(char type, Double balance, Boolean status) {
		if (type == 'C' && status == true) {
			balance -= 12.0;
		} else if(type == 'P' && status == true){
			balance -= 20.0;
		}
	}

	@Override
	public String toString() {
		return "Conta: " + number 
				+ ", Titular: " + owner 
				+ String.format(", Saldo: %.2f", balance);
	}
	
	public static void options() {
		System.out.println("- - - BANCO CURSO EM VIDEO - - -");
		System.out.println();
		System.out.println("1 - ABRIR CONTA");
		System.out.println("2 - CONSULTAR SALDO");
		System.out.println("3 - DEPOSITO");
		System.out.println("4 - SAQUE");
		System.out.println("5 - ENCERRAR CONTA");
		System.out.println("6 - SAIR");
		System.out.println();
	}
	
}
