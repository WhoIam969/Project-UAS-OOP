package MyClass;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
  
      Keyboard key1 = new Keyboard("Vortex Series VX7", 1000000, 97, "RGB", 87, "Outemu Blue");
  
      key1.cetakInfoBarang();
  
      Processor proc1 = new Processor("AMD Ryzen 5 3600", 3000000, 24, 3.6, 4.2);
      proc1.cetakInfoBarang();
      
      // Instansiasi Object Penjual
      Penjual penjual1 = new Penjual("Udin", 21, "Laki-laki", 2);
      penjual1.cetakInfoUser();
  
      // Instansiasi Object Pembeli
      Pembeli pembeli1 = new Pembeli("Siti", 19, "Perempuan", "081234546571", "Jakarta");
      pembeli1.cetakInfoUser();
  
      Transaksi trs1 = new Transaksi(penjual1, pembeli1, key1);
      Transaksi trs2 = new Transaksi(penjual1, pembeli1, proc1);

      
      
      System.out.println("Stock Barang =" + proc1.getStokBarang());

    JFrame myFrame;

	  myFrame = new JFrame();
	  myFrame.setSize(500,400); 		 
    myFrame.setVisible(true);

    JOptionPane.showMessageDialog(myFrame, "Pembeli : " + pembeli1.getNama());
    JOptionPane.showMessageDialog(myFrame, "Penjual : " + penjual1.getNama());


  
  
  
    }
  
  }