package Assignment;

public class Q4 {

	public static void main(String[] args) {
		System.out.println("Calling Object of class one");
		 Three obj =new  Three(1);
		 System.out.println("Calling Default object two ");
		 Three obj1  = new Three();
		 System.out.println(obj);
		 System.out.println(obj1);
		 

	}

}
	class One 
	{
	     One (int a) {
	    	 System.out.println("WE are inside Class one ");
	     }
	}
	class Two  extends One
	{
		 Two()
		 {
			 super(2);
			 System.out.println("We are inside class Two");
		 }
	}
	class Three extends Two 
	{
		 Three(int b )
		 {
			 System.out.println("We are inside class Three Paramatised");
		 }
		 Three ()
		 {
			  System.out.println("We are in default class Three");
		 }
	}