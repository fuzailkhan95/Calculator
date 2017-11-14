import java.util.Scanner;

public class project1 {

		static char operation;
		
		static Scanner in = new Scanner(System.in);

		public static void main(String[] args) {
			String x = "y";
			while(x.equalsIgnoreCase("y")){
			
			System.out.println("What calculator do you want to use? Standard or Scientific?");
			String stanSci= in.next();
			if(stanSci.equalsIgnoreCase("Standard")){
				System.out.println("Which operation do you want to use?");
				operation = in.next().charAt(0);
				while( operation != '+' && operation != '-' && operation != '*' && operation != '/' ){
				System.out.println("You have entered a wrong operation! Try again.");
				operation = in.next().charAt(0);
				}
				
				System.out.println("How many numbers do you want to enter?");
				int qnum = in.nextInt();
						
				
				
				System.out.println("What is the first value?");
				double finalA = in.nextDouble();
				
				for(int i = 1; i< qnum; i++){
					System.out.println("What is the next value?");
			
				switch(operation){
					case '+':
						finalA = finalA+in.nextDouble();
						break;
					case '-':
						
						finalA = finalA-in.nextDouble();
						
						break;
					
					case '*':
						finalA = finalA*in.nextDouble();
					
						break;
					case '/':
						finalA = finalA/in.nextDouble();
						
						break;
				}
				
	     	}
				System.out.println("Your answer is: " + finalA);
			}
			else if(stanSci.equalsIgnoreCase("Scientific")){
				System.out.println("Which operation do you want to use? ");
				stanSci = in.next();
				
				if(stanSci.equals("sin")){
					System.out.println("Which integer do you want to use?");
					int a = in.nextInt();
					double result = Math.sin(a);
					System.out.println("Your answer is : " + result);
				}
				if(stanSci.equals("cos")){
					System.out.println("Which integer do you want to use?");
					int a = in.nextInt();
					double result = Math.cos(a);
					System.out.println("Your answer is : " + result);
				}
				if(stanSci.equals("tan")){
					System.out.println("Which integer do you want to use?");
					int a = in.nextInt();
					double result = Math.tan(a);
					System.out.println("Your answer is : " + result);
				}
				else if(stanSci.equals("*")||stanSci.equals("/")||stanSci.equals("+")||stanSci.equals("-")){
					System.out.println("How many numbers do you want to enter?");
					int z = in.nextInt();
					
					System.out.println("What is the first value?");
					double finalA = in.nextDouble();
					
					for(int i = 1; i< z; i++){
						System.out.println("What is the next value?");
				
					switch(stanSci){
						case "+":
							finalA = finalA+in.nextDouble();
							break;
						case "-":
							
							finalA = finalA-in.nextDouble();
							
							break;
						
						case "*":
							finalA = finalA*in.nextDouble();
						
							break;
						case "/":
							finalA = finalA/in.nextDouble();
							
							break;
					}
					
		     	}
					System.out.println("Your answer is : " + finalA);
				}
				
				
				
			}
			
			System.out.println("Do you want to restart? Write 'Y'for yes and 'N'for no");
			x =in.next();
	}
	}
	}
