/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClass;

/**
 *
 * @author 62896
 */
public class Processor extends Barang {
  
    // property
    private double frekuensiDasar;
    private double turboBoost;
  
    // overriding method abstract
    @Override
    public String tampilJenisBarang()
    {
      return "Ini processor";
    }
  
    public Processor( String namaBarang, int hargaBarang, int stokBarang, double frekuensiDasar, double turboBoost )
    {
      super(namaBarang, hargaBarang, stokBarang);
      this.frekuensiDasar = frekuensiDasar;
      this.turboBoost = turboBoost;
    }
  
    // setter dan getter
    public void setFrekuensiDasar( double frekuensiDasar )
    {
      this.frekuensiDasar = frekuensiDasar;
    }
    public double getFrekuensiDasar()
    {
      return this.frekuensiDasar;
    }
  
    public void setTurboBoost( double turboBoost )
    {
      this.turboBoost = turboBoost;
    }
    public double getTurboBoost()
    {
      return this.turboBoost;
    }
  
    // Overriding
    @Override
    public void cetakInfoBarang()
    {
      super.cetakInfoBarang();
      System.out.println(", Frekuensi Dasar : " + this.frekuensiDasar + ", Turbo Boost : " + this.turboBoost + "\n");
    }
  
  }
