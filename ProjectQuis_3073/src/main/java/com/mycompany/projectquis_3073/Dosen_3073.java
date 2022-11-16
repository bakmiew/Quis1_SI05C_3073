/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectquis_3073;

/**
 *
 * @author Tectonia
 */
public class Dosen_3073 extends Penduduk_3073{
  String nidn_3073;
  String gol_3073;
  int gajiPokok_3073 = 5500000;
  double totalGaji;
  int tunjangan;
  
  public double totalPendapatan3073 () {
    if (gol_3073 == "IIIA") {
      tunjangan = 300000;
    }
    else if (gol_3073 == "IIIB") {
      tunjangan = 500000;
    }
    else if (gol_3073 == "IIIC") {
      tunjangan = 700000;
    }
    return totalGaji = gajiPokok_3073 + tunjangan;
  }
  
  public void tampilDataDosen_3073_1() {
    super.tampilDataPenduduk3073();
    System.out.println("NIK                   : " + nik_3073);
    System.out.println("Nama                  : " + nama_3073);
    System.out.println("Umur                  : " + umur_3073);
    System.out.println("Alamat                : " + alamat_3073);
    System.out.println("NIDN                  : " + nidn_3073);
    System.out.println("Golongan              : " + gol_3073);
    System.out.println("Gaji Pokok            : " + gajiPokok_3073);
  }
  
   public void tampilDataDosen_3073_2() {
    super.tampilDataPenduduk3073();
    System.out.println("NIK                   : " + nik_3073);
    System.out.println("Nama                  : " + nama_3073);
    System.out.println("Umur                  : " + umur_3073);
    System.out.println("Alamat                : " + alamat_3073);
    System.out.println("NIDN                  : " + nidn_3073);
    System.out.println("Golongan              : " + gol_3073);
    System.out.println("Gaji Pokok            : " + gajiPokok_3073);
  }
}
