package TP_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Etudiant {
	

	private String login;
	private InetAddress ip;
	private int port;
	private boolean etat;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public InetAddress getIp() {
		return ip;
	}

	public void setIp(InetAddress ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Etudiant(String login, InetAddress ip, int port, boolean etat) {
		super();
		this.login = login;
		this.ip = ip;
		this.port = port;
		this.etat = etat;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

}
