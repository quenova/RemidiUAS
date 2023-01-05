/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RemidiUAS;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class RemidiUAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner masukan = new Scanner(System.in);
        int tahun;
        String jurusan =null;
        String choice;
   do{        
            System.out.print("masukkan NIM:");
            String NIM = masukan.nextLine();
            
            System.out.print("masukkan NAMA:");
            String NAMA = masukan.nextLine();
          
         
            System.out.println("NIM  =" +NIM);
            System.out.println("NAMA  =" +NAMA);
            
            String[] arrayke = NIM.split("\\.");
            
            tahun = Integer.parseInt(arrayke[0]);
             
            System.out.println("Tahun Ajaran :" + "20" + tahun + "-20" + (tahun + 1) );
            
            if( arrayke[1].equals("31")){
                 jurusan = "D3-Sistem Informasi"; 
            } else if (arrayke[1].equals("51")){
                jurusan = "S1-Sistem Informasi";
            }else if (arrayke[1].equals("52")){
                jurusan = "S1-Teknologi Informatika";
            } else {
                jurusan = "tidak dapat menemukan jurusan dari nim anda";
            }
               
            System.out.println("jurusan =" + jurusan);
            System.out.println("No urut masuk = " +   arrayke[2].replaceAll("\\b0+(?!\\b)", ""));
            
            System.out.print("apakah anda ingin memasukkan data lagi [ya/tidak}]:");
            choice = masukan.nextLine(); 
    }while(choice.equals("ya") ||  choice.equals("YA") || choice.equals("y") );
            System.exit(0);
    }

}