
class mini_market {
    String namaMinimarket ; 
    String alamatMinimarket ; 
    int noTelp ;
    int jumlahPegawai ;
    
    void setMinimarket(String newNamaMinimarket, String newAlamatMinimarket, int newNoTelp, int newJumlahPegawai ) {
        this.namaMinimarket = newNamaMinimarket; 
        this.alamatMinimarket = newAlamatMinimarket ; 
        this.noTelp = newNoTelp; 
        this.jumlahPegawai= newJumlahPegawai; 
    }
    String getNamaMinimarket(){
        return namaMinimarket ; 
    } 
    String getAlamat(){
        return alamatMinimarket;
    }
    int getTelp(){
        return noTelp;
    }
    int getJumlahPegawai(){
        return jumlahPegawai;
    }
}

class produk {
    String namaProduk ; 
    String jenisProduk ; 
    int hargaProduk ;  
    int stokProduk ; 

    void setProduk(String newNamaProduk, String newJenisProduk, int newHargaProduk, int newStokProduk){
        this.namaProduk = newNamaProduk ;         
        this.jenisProduk = newJenisProduk ; 
        this.hargaProduk = newHargaProduk; 
        this.stokProduk = newStokProduk;   
    }
    String getNamaProduk() {
        return namaProduk;
    }
    String getJenisProduk() {
        return jenisProduk;
    }
    int getHargaProduk(){
        return hargaProduk;
    }
    int getStokProduk(){
        return stokProduk;
    }
}

public class Minimarket {
    public static void main(String[] args) {
        mini_market minimarket1 = new mini_market();
        minimarket1.setMinimarket("Indoalfa", "Sumbersari B/10", 628114214, 6);

        produk produk1 = new produk();
        produk1.setProduk("Coklat SilverKing", "Makanan",  10000, 50);
        
        System.out.println("Data Minimarket: ");
        System.out.println(minimarket1.getNamaMinimarket());
        System.out.println("Alamat  : " + minimarket1.getAlamat());
        System.out.println("No.Telp : " + minimarket1.getTelp()); 
        System.out.println("Jumlah Pegawai:" + minimarket1.getJumlahPegawai()); 
        
        System.out.println("Data Produk:  ");
        System.out.println(produk1.getNamaProduk());
        System.out.println("Jenis : " + produk1.getJenisProduk());
        System.out.println("Harga : Rp." + produk1.getHargaProduk());
        System.out.println("Stok  : " + produk1.getStokProduk());
        
        System.out.println("Minimarket "+ minimarket1.getNamaMinimarket() + " memiliki stok " + produk1.getNamaProduk() + " sebanyak " + produk1.getStokProduk());
    }
  }
