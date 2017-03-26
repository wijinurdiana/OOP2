class kulkas{
	//Atribut class pada kulkas{
	String warna;
	String merk;
	String type;
	
	void hidupkanKulkas(){
		System.out.println("Kulkas Hidup");
	}
	
	void matikanKulkas(){
		System.out.println("Kulkas Mati");
	}
		
	public static void main(String[] args){
		kulkas KulkasKu=new kulkas(); 
		KulkasKu.warna="Putih";
		KulkasKu.merk="LG";
		KulkasKu.type="Dua Pintu"; 
		
		System.out.println(KulkasKu.warna);
		System.out.println(KulkasKu.merk);
		System.out.println(KulkasKu.type);
		
		KulkasKu.hidupkanKulkas();
		KulkasKu.matikanKulkas();
		}
}