package Assignment;

public class Q2 {
	public static void main(String[] args) {
	function obj1 = new function() ;
	obj1.call() ; 
	function obj2 = new function() ;
	obj2.call() ;
	function obj3 = new function() ;
    obj3.call();
    System.out.println(" no of calls :"+ function.count);

  }
}
class function
{
	static int  count = 0 ; 
	void call() {
		count++ ;
	}
}
