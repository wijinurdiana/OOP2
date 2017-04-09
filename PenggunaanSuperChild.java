public class PenggunaanSuperChild extends PenggunaanSuper {
	int num = 10;
	public void tampilkan () {
		System.out.println("Ini tampilan dari sub class");
	}
	public void PenggunaanSuper (){
		tampilkan();
		super.tampilkan();
		System.out.println("Nilai variable pada sub class:" + num);
		System.out.println("Nilai Variable pada sub class:" + super.num);
	}
	public static void main (String[]args){
		PenggunaanSuperChild obj = new PenggunaanSuperChild();
		obj.PenggunaanSuper();
	}
}