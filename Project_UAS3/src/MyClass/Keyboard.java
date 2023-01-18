/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClass;

/**
 *
 * @author 62896
 */
public class Keyboard extends Barang{
  
    // property
    private String backlight;
    private int banyakKeys;
    private String tipeSwitch;
  
    // overriding method abstract
    @Override
    public String tampilJenisBarang()
    {
      return "Ini keyboard";
    }
  
    // method
    public Keyboard( String namaBarang, int hargaBarang, int stokBarang, String backlight, int banyakKeys, String tipeSwitch )
    {
      super(namaBarang, hargaBarang, stokBarang);
      this.backlight = backlight;
      this.banyakKeys = banyakKeys;
      this.tipeSwitch = tipeSwitch;
    }
  
    // setter dan getter
    public void setBacklight( String backlight )
    {
      this.backlight = backlight;
    }
    public String getBacklight()
    {
      return this.backlight;
    }
  
    public void setBanyakKeys( int banyakKeys )
    {
      this.banyakKeys = banyakKeys;
    }
    public int getBanyakKeys()
    {
      return this.banyakKeys;
    }
  
    public void setTipeSwitch( String tipeSwitch )
    {
      this.tipeSwitch = tipeSwitch;
    }
    public String getTipeSwitch()
    {
      return this.tipeSwitch;
    }
  
  
    // Overriding
    @Override
    public void cetakInfoBarang()
    {
      super.cetakInfoBarang();
      System.out.println(", Backlight : " + this.backlight + ", Banyak Keys : " + this.banyakKeys + ", Tipe Switch : " + this.tipeSwitch + "\n");
    }
  
  }