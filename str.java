package builtin;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= new String("gocorona");
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		
		System.out.println(s.charAt(3));
			
		System.out.println(s.indexOf('o'));  // multiple occurance
		
		System.out.println(s.lastIndexOf('o'));
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(0,7)); 
		
		// last value is exclusive 
		
		String s1="loki";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		
		String a="Bat";
		String b="Bat";
		
		System.out.println(a.equals(b));
		
		
		System.out.println(s.replace("corona", "negative"));
		
		
	}

	}


