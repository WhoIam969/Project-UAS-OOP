/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClass;

/**
 *
 * @author 62896
 */
public class Penjual extends User {

    // Property
    private int lamaKerjaPerTahun;
  
    @Override
    public String tampilJenisUser()
    {
      return "Ini Penjual";
    }
  
    // Method
    // Method Constructor
    public Penjual( String nama, int umur, String jenisKelamin, int lamaKerjaPerTahun )
    {
      super(nama, umur, jenisKelamin);
      this.lamaKerjaPerTahun = lamaKerjaPerTahun;
    }
  
    // Method Wajib
    @Override
    public void cetakInfoUser()
    {
      super.cetakInfoUser();
      System.out.println(", Lama Kerja PerTahun : " + this.lamaKerjaPerTahun + "tahun.\n");
    }
  
    // Method Setter
  
    public void setLamaKerjaPerTahun(int lamaKerjaPerTahun)
    {
      this.lamaKerjaPerTahun = lamaKerjaPerTahun;
    }
  
    // Method Getter
  
    public int getLamaKerjaPerTahun()
    {
      return this.lamaKerjaPerTahun;
    }
  
  }
