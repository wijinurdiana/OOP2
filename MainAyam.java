class Hewan{
	public void makan(){
		System.out.println("Hewan bisa makan");
	}
}

class Ayam extends Hewan{

	public void makan(){
		System.out.println("Ayam bisa makan");
		super.makan();
	}
}

public class MainAyam{

	public static void main(String[]args){
		Hewan ayam = new Hewan();
		Ayam ayamkate = new Ayam();
		ayam.makan();
		ayamkate.makan();
	}
}