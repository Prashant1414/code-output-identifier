package app.com;

public class StringFormat {

	public static void main(String[] args) {
	
		
		String name="prasha";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %32.12f",322.33434);//returns 12 char fractional part filling with 0  
		  
		System.out.println(sf1);  // name is prasha
		System.out.println(sf2);  // value is 32.334340
		System.out.println(sf3);  // value is                 322.334340000000

	}

}
