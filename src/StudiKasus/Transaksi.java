/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

/**
 *
 * @author Cheeettoozzz
 */
 class Transaksi extends pembeli{
    private int jml;
    
    public Transaksi(int id_barang, String nama_barang, int harga_barang, String merk_barang, int id_pembeli, String nama_pembeli, String alamat, String no_telp,int jml) {
        super(id_barang, nama_barang, harga_barang, merk_barang, id_pembeli, nama_pembeli, alamat, no_telp);
        this.jml = jml;
    
    }

    @Override
    public void info() {
        super.info(); 
        System.out.println(" Jumlah Barang      :  "+this.jml);
        System.out.println(" ======================================== ");
        System.out.println(" Total Harga        : " +(harga_barang * jml));
    }
    
    
    
}
