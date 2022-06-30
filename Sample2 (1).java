//Complete and execute java Program for making a simple calculator using switch case
class Sample2 {

	public static void main(String args[]) {

    		//Intialize the char variable below with operators (+, -, *, /) one by one and check the output
    		char operator = '+';
    		
	  	int first=10,second=5;
      int result=0;
    		switch (operator) {
      		case '+':
        	//Write code to perform addition of first and second
            result=first+second;
            System.out.println("addition of first and second:"+result);
      		case '-':
        	//Write code to perform subtraction 
           result=first-second;
            System.out.println("subtraction of first and second:"+result);
      		case '*':
        	//Write code to perform multiplication
           result=first*second;
            System.out.println("multplication of first and second:"+result);
      		case '/':
        	//Write code to perform division
              result=first/second;
            System.out.println("division of first and second:"+result);
      		//If operator doesn't match any case constant (+, -, *, /)
      		default:
        	// Print Error stating operator is not correct
       System.out.println("invalid");
    		}

    		System.out.println(first + operator + " +" + second + " = " + result);
  	}
}
