public class CalculatorMain{
	
	public void perkalian (int x, int y){
		int z; 
		z = x * y;
		System.out.println ("hasil:" + z);
	}
	public static void main (String [] args) {
		int a =20, b= 10;
		CalculatorMain cal = new CalculatorMain();
		//cal.pertambahan (a,b); dipakai saat CalculatorMain extends Calculator
		//cal.pengurangan (a,b);

		cal.perkalian (a,b);

		Calculator cal2 = new Calculator();
		cal2.pertambahan (a,b);
		cal2.pengurangan (a,b);

	}
}