/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectquis_3073;
import java.util.Scanner;
/**
 *
 * @author Tectonia
 */
public class ProjectQuis_3073 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa_3073 mahasiswa_3073_1 = new Mahasiswa_3073();
        Mahasiswa_3073 mahasiswa_3073_2 = new Mahasiswa_3073();
        Dosen_3073 dosen_3073_1 = new Dosen_3073();
        Dosen_3073 dosen_3073_2 = new Dosen_3073();
   
        System.out.println("NIK                     :");
        mahasiswa_3073_1.nik_3073 = input.next();
        System.out.println("Nama                    :");
        mahasiswa_3073_1.nama_3073 = input.next();
        System.out.println("Umur                    :");
        mahasiswa_3073_1.umur_3073 = input.nextInt();
        System.out.println("Alamat                  :");
        mahasiswa_3073_1.alamat_3073 = input.next();
        System.out.println("NIM                     : ");
        mahasiswa_3073_1.nim_3073 = input.next();
        System.out.println("IPK                     : ");
        mahasiswa_3073_1.ipk_3073 = input.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        mahasiswa_3073_2.nik_3073 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3073_2.nama_3073 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3073_2.umur_3073= input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3073_2.alamat_3073 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3073_2.nim_3073 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3073_2.ipk_3073 = input.nextInt();
        

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA MAHASISWA");
        mahasiswa_3073_1.tampilDataBeasiswa3073();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        mahasiswa_3073_2.tampilDataMahasiswa_3073_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3073_1.nik_3073 = input.next();
        System.out.println("Nama                : ");
        dosen_3073_1.nama_3073 = input.next();
        System.out.println("Umur                : ");
        dosen_3073_1.umur_3073 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3073_1.alamat_3073 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3073_1.nidn_3073 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3073_1.gol_3073 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3073_1.gajiPokok_3073);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3073_1.nik_3073 = input.next();
        System.out.println("Nama                : ");
        dosen_3073_1.nama_3073 = input.next();
        System.out.println("Umur                : ");
        dosen_3073_1.umur_3073 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3073_1.alamat_3073 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3073_1.nidn_3073 = input.next();
        System.out.println("Golongan              : ");
        dosen_3073_1.gol_3073 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3073_2.gajiPokok_3073);
        // dosen_3071_1.gajiPokok_3071 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA DOSEN");
        dosen_3073_1.tampilDataDosen_3073_1();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        dosen_3073_2.tampilDataDosen_3073_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
