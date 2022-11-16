/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectquis_3073;

/**
 *
 * @author Tectonia
 */
public class Mahasiswa_3073 extends Penduduk_3073{
  String nim_3073;
  float ipk_3073;
  boolean beasiswa_3073;
  
  public void tampilDataMahasiswa_3073_1() {
    super.tampilDataPenduduk3073();
    System.out.println("NIK                 : " + nik_3073);
    System.out.println("Nama                : " + nama_3073);
    System.out.println("Umur                : " + umur_3073);
    System.out.println("Alamat              : " + alamat_3073);
    System.out.println("NIM                 : " + nim_3073);
    System.out.println("IPK                 : " + ipk_3073);
    tampilDataBeasiswa3073();   
  }
  public void tampilDataMahasiswa_3073_2 () {
    super.tampilDataPenduduk3073();
    System.out.println("NIK                 : " + nik_3073);
    System.out.println("Nama                : " + nama_3073);
    System.out.println("Umur                : " + umur_3073);
    System.out.println("Alamat              : " + alamat_3073);
    System.out.println("NIM                 : " + nim_3073);
    System.out.println("IPK                 : " + ipk_3073);
    tampilDataBeasiswa3073();
  }
  
  public void tampilDataBeasiswa3073 () {
    if (ipk_3073 > 3.5) {
      beasiswa_3073 = true;
      System.out.println("Mahasiswa bernama " + nama_3073 + " berhak mendapatkan beasiswa");
    }
    else if (ipk_3073 < 3.5) {
      beasiswa_3073 = false;
      System.out.println("Mahasiswa bernama " + nama_3073 + " tidak berhak mendapatkan beasiswa");
    }
  }
}
