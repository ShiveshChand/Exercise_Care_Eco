public class function{
 static	int sum(int a,int b) {
		int c = a+b;
		return c;	
	}
	public static void main(String args[]) {
  	        int a = 5;  int b = 8;
		int c = a*b;
		System.out.println(c);	
	int	age = 18;
	if(age>18) {
		System.out.println("I am eligible for vote");
	}
	else if(age>=18){
		System.out.println("think about it");
	}
		else {
			System.out.println("you are not eligible");
		}
	int [] arry = {1,2,3,4,5};
	System.out.println(arry);
	System.out.println(arry[2]);
	try {
	System.out.println(arry[9]); // Exception ArryOutofBounds  
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("I will handle exception easily");
	}
     String [] Arry = {"ramesh","shivesh","Prince","Brijesh"};
     System.out.println(Arry);
     String s = "This is string";
    		 System.out.println(s.endsWith(s));
    		 System.out.println(s.length());
    		 System.out.println("this is adding method" +  s); 
   System.out.println(sum(10,15)); // When We create function Static There is no need to Crate Object
    function obj=new function();
    System.out.println(obj.sum(10, 20));
    
    
	}
	
}   
