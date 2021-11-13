package TP_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ProcessETD {

	public static void main(String[] args) throws Exception {

		DatagramSocket sc = new DatagramSocket();
		SendEtd s = new SendEtd(sc);
		s.start();
		ReceiveEtd r = new ReceiveEtd(sc);

		r.start();
	}

}
