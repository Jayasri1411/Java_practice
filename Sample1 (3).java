// Complete and execute java Program for checking the number of digits in a number
class Sample1 {

	public static void main(String args[]) {
		int num =1234;// you can also change the value to test the output
		
		if(num>=4) {
	  		System.out.println("Its a two digit number");
		}
		else if(num<4) {
	  		System.out.println("Its a three digit number");
		}
		else if(num>3) {
	  		System.out.println("Its a four digit number");
		}
		else if(num<3) {
	  		System.out.println("Its a five digit number");			
		}
		else {
	  		System.out.println("number is not between 1 & 99999");			
		}
   	}
}
