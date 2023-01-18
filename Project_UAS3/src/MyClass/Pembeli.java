/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClass;

/**
 *
 * @author 62896
 */
public class Pembeli extends User {

    // property
    private String noTelp;
    private String alamat;
  
    @Override
    public String tampilJenisUser()
    {
      return "Ini Pembeli";
    }
    
    // method
    // Method Constructor
    public Pembeli( String nama, int umur, String jenisKelamin, String noTelp, String alamat )
    {
      super(nama, umur, jenisKelamin);
      this.noTelp = noTelp;
      this.alamat = alamat;
    }
  
    // Method Wajib
    public void cetakInfoUser()
    {
      super.cetakInfoUser();
      System.out.println(", No Telepon : " + this.noTelp + ", Alamat Pembeli : " + this.alamat + ".\n");
    }
  
    // Method Setter
  
    public void setNoTelp(String noTelp)
    {
      this.noTelp = noTelp;
    }
  
    public void setAlamat(String alamat)
    {
      this.alamat = alamat;
    }
  
    // Method Getter
  
    public String getNoTelp()
    {
      return this.noTelp;
    }
  
    public String getAlamat()
    {
      return this.alamat;
    }
  
  
    
  }