package TP_2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;

public class ServeurTP1 {
	public static List<Etudiant> listeETD = new ArrayList<>();

	public static List<Message> listeMsg = new ArrayList<>();
	public static List<Groupe> listeGrp = new ArrayList<>();

	public static void main() throws Exception {
		DatagramSocket sc = new DatagramSocket(3000);
		DatagramPacket pk = new DatagramPacket(new byte[1024], 1024);
		sc.receive(pk);
		String msg = new String(pk.getData(), 0, pk.getLength());
		
		while(true)
		if (msg.startsWith("##"))
		{
			
			listeETD.add(new Etudiant(msg, pk.getAddress(), pk.getPort(), true));
		}
		else if(msg.startsWith("#List"))
		{
			for (Etudiant et: listeETD ) 
			{
			System.out.println(et.getLogin());
			}
		}
			else if (msg.startsWith("@#"))
			{
				String[] t =msg.split("@#");
		}
			
		

	}
}
