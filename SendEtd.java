package TP_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendEtd extends Thread {
	
	DatagramSocket sc;

	public SendEtd( DatagramSocket sc) {

		this.sc = sc;
	}

	public void run() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				String msg = in.readLine();
				DatagramPacket pk = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getLocalHost(), 3000);
				sc.send(pk);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}