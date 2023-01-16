package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnvioEmail {
	
	public static void main(String[] args) throws EmailException {
		
		String para = "charlesfonsecamorais@gmail.com";
		String assunto = "Teste de e-mail Java";
		String msg = "E-mail enviado via Eclipse";
		
		enviar(para, assunto, msg);
		
		System.out.println("E-mail enviado com sucesso!");
	}
	
	static void enviar(String para, String assunto, String msg) throws EmailException {
		String username = "usuario@hotmail.com";
		String password = "senha";

		Email email = new SimpleEmail();
		email.setHostName("smtp.office365.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator(username, password));
		email.setFrom(username);
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.setStartTLSEnabled(true);
		email.send();
	}

}
