public class pegawai{
    private String nama,nip;
    private double gajiPokok=2000,lembur,uangMakan=3500,transport=4000,totalGaji;
    private int jumlahJamKerja;

    pegawai(String newName , String newNip ){
        this.nama = newName;
        this.nip = newNip;
    }

    public int getJamKerja(){
        return jumlahJamKerja;
    }

    public void setJamKerja(int newJamKerja){
        this.jumlahJamKerja = newJamKerja;
    }

    public void hitungGajiHarian(){
        if(jumlahJamKerja > 0 && jumlahJamKerja <= 7){
            this.totalGaji = gajiPokok * jumlahJamKerja;
        }else if(jumlahJamKerja > 7 && jumlahJamKerja <= 8){
           this.totalGaji = (gajiPokok * jumlahJamKerja) + (1.5 * gajiPokok);  
        }else if(jumlahJamKerja  > 8 && jumlahJamKerja <= 9){
            this.totalGaji = (gajiPokok * jumlahJamKerja) + (1.5 * gajiPokok) + uangMakan;  
        }else if(jumlahJamKerja > 9 ){
            this.totalGaji = (gajiPokok * jumlahJamKerja) + (1.5 * gajiPokok) + uangMakan + transport;  
        }else{
            System.out.println("Maaf jumlah jam yang anda masukkan tidak valid");
        }
    }

    public void cetakPenghasilan(){
        System.out.println("    Nama Pegawai     : " + nama );
        System.out.println("    NIP              : " + nip );
        System.out.println("    Gaji Pokok       : " + gajiPokok);
        System.out.println("    Jumlah Jam Kerja : " + jumlahJamKerja);
        System.out.println("    Total Gaji       : " + totalGaji);
        
    }

}