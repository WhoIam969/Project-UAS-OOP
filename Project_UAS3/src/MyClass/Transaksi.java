/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClass;

/**
 *
 * @author 62896
 */
public class Transaksi {

    public Transaksi( Penjual penjual, Pembeli pembeli, Barang barang )
    {
  
      System.out.println("Penjual : " + penjual.getNama() + ", Pembeli : " + pembeli.getNama() + ", Barang : " + barang.getNamaBarang() + ", Jenis Barang : " + barang.tampilJenisBarang() + "\n");
  
      int stokBaru = barang.getStokBarang() - 1;
  
      barang.setStokBarang(stokBaru);
  
    }
    
  }