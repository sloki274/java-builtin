package builtin;

public class math {
	public static void main(String[] args) {
		
	// static= called by classname.methodname
		
		System.out.println(math.class);
		System.out.println(Math.pow(4, 5));
		
		int p=50000;
		double rate=0.07;
		int n = 2;
		
	double total = p*Math.pow((1+rate/n), n);
	System.out.println(total);
	System.out.println(Math.sqrt(178));
	System.out.println(Math.cbrt(178));
}
}