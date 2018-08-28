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
 class pembeli extends Toko{
    private int id_pembeli;
    private String nama_pembeli;
    private String alamat;
    private String no_telp;

    public pembeli(int id_barang, String nama_barang, int harga_barang, String merk_barang,int id_pembeli, String nama_pembeli, String alamat, String no_telp) {
        super(id_barang, nama_barang, harga_barang, merk_barang);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }

    @Override
    public void info() {
        super.info(); 
        System.out.println(" ======================================== ");
        System.out.println(" No ID pembeli      : "+this.id_pembeli);
        System.out.println(" Nama Pembeli       : "+this.nama_pembeli);
        System.out.println(" Alamat             : "+this.alamat);
        System.out.println(" No Telephone       : "+this.no_telp);
    }
    }
    
    

