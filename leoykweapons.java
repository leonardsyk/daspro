class Senpi
{
	private String nama;
	private String produser;
	private String jaraktembak;
	private int kapasitaspeluru;

	public Senpi(String nm,String prod,String jtmb, int kaps)
	{ this.nama=nm;
		this.produser=prod;
		this.jaraktembak=jtmb;
		this.kapasitaspeluru=kaps;
	}

	public void tampilData()
	{
		System.out.println("LEOYK FIREARMS CORP.");
		System.out.println("Nama : "+this.nama);
		System.out.println("Produser Senpi : "+this.produser);
		System.out.println("Jarak Tembak : "+this.jaraktembak);
		System.out.println("Kapasitas Peluru : "+this.kapasitaspeluru);
	}
}

public class leoykweapons{
	public static void main(String[] args){
	Senpi sen=new Senpi("M4A1 MK18 MOD 0","Colt Arms Co.","500 meter",30);
	sen.tampilData();
	}
}