/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClass;

/**
 *
 * @author 62896
 */
abstract class User {

    private String nama;
    private int umur;
    private String jenisKelamin;
  
    public abstract String tampilJenisUser();
  
    public User( String nama, int umur, String jenisKelamin )
    {
      this.nama = nama;
      this.umur = umur;
      this.jenisKelamin = jenisKelamin;
    }
  
    public void cetakInfoUser()
    {
      System.out.print("Nama : " + this.nama + ", Umur : " + this.umur + "tahun, Jenis Kelamin : " + this.jenisKelamin);
    }
  
    // Method Setter
    public void setNama(String nama)
    {
      this.nama = nama;
    }
  
    public void setUmur(int umur)
    {
      this.umur = umur;
    }
  
    public void setJenisKelamin(String jenisKelamin)
    {
      this.jenisKelamin = jenisKelamin;
    }
  
    // Method Getter
    public String getNama()
    {
      return this.nama;
    }
  
    public int getUmur()
    {
      return this.umur;
    }
  
    public String getJenisKelamin()
    {
      return this.jenisKelamin;
    }
    
  }
