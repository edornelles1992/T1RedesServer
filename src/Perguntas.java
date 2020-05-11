
public class Perguntas {

	public static final Pergunta[] normal = new Pergunta[3];
	public static final Pergunta[] dificil = new Pergunta[3];

	static {
		montarPerguntasNormal();
		montarPerguntasDificil();
	}

	private static void montarPerguntasNormal() {
		normal[0] = new Pergunta("Qual protocolo � utilizado para comunica��o de correio eletr�nico?", "IMAP", "POP",
				"SMTP", "SMTP");
		normal[1] = new Pergunta(
				"Fornece endere�os IP tempor�rios e gerencia de forma central e autom�tica a atribui��o das configura��es TCP/IP das m�quinas de uma rede. Qual protocolo possui essas fun��es?",
				"DHCP", "NAT", "IMAP", "DHCP");
		normal[2] = new Pergunta("Qual das alternativas representa uma caracter�stica de um Socket UDP?",
				"Controla o estado de conex�o", "Garante ordem de entrega", "N�o confi�vel", "N�o confi�vel");
	}

	private static void montarPerguntasDificil() {
		dificil[0] = new Pergunta("Qual das alternativas representa uma caracter�stica de um Socket TCP?",
				"N�o garante entrega", "Controle de congestionamento e fluxo", "N�o tem estado de conex�o",
				"Controle de congestionamento e fluxo");
		dificil[1] = new Pergunta("Uma m�scara M�scara: 255.255.0.0, representa um endere�o IP de qual classe?",
				"Classe A", "Classe B", "Classe C", "Classe B");
		dificil[2] = new Pergunta("Normalmente o primeiro endere�o de uma subrede � destinado ao:",
				"Endere�o de Broadcast", "Endere�o de M�scara", "Endere�o de Rede", "Endere�o de Rede");
	}

	public static Pergunta[] getNormal() {
		return normal;
	}

	public static Pergunta[] getDificil() {
		return dificil;
	}

}
