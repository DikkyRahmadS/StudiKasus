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
    class Toko {
    private int id_barang;
    private String nama_barang;
    int harga_barang;
    private String merk_barang;
    
    public Toko (int id_barang,String nama_barang, int harga_barang, String merk_barang){
    this.id_barang = id_barang;
    this.nama_barang = nama_barang;
    this.harga_barang = harga_barang;
    this.merk_barang = merk_barang;
    
    }
    
     public void info ()
    {
        System.out.println(" ======================================== ");
        System.out.println(" No ID Barang       : "+this.id_barang);
        System.out.println(" Nama barang        : "+this.nama_barang);
        System.out.println(" Harga Barang       : "+this.harga_barang);
        System.out.println(" Nama Merk          : "+this.merk_barang);
    }
    
}
