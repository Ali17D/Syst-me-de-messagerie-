package TP_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveEtd extends Thread {

	DatagramSocket sc;

	public ReceiveEtd(DatagramSocket sc)

	{
		this.sc = sc;
	}

	public void run() {
		while (true) {
			DatagramPacket pk = new DatagramPacket(new byte[1024], 1024);
			try {
				sc.receive(pk);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String msg = new String(pk.getData());
			System.out.println(msg);
		}
	}
}
