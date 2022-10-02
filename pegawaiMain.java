import java.util.Scanner;
public class pegawaiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama , nip ;
        int jumlahPegawai , jumlahJam;
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|    PENGHITUNGAN GAJI PEGAWAI    |");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" ");
        
        System.out.println("-----------------------------------");
        System.out.print("Masukkan jumlah pegawai :  ");
        jumlahPegawai = input.nextInt();
        System.out.println("-----------------------------------");
        
        for(int i=0 ; i < jumlahPegawai ; i++){
        System.out.println("-----------------------------------");
        System.out.println("Data Pegawai ke : " + (i+1));
        System.out.println("-----------------------------------");
        System.out.print("Masukkan nama pegawai     : ");
        nama = input.next();
        System.out.print("Masukkan nip pegawai      : ");
        nip = input.next();
        System.out.print("Masukkan jumlah jam kerja : ");
        jumlahJam = input.nextInt();
        
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        pegawai pg1 = new pegawai(nama,nip);
        pg1.setJamKerja(jumlahJam);
        pg1.hitungGajiHarian();
        pg1.cetakPenghasilan();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println(" ");
        }
        
    } 
}
