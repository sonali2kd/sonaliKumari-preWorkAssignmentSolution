import java.util.Scanner;

public class PreWorkAssignment{
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		PreWorkAssignment obj = new PreWorkAssignment();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("\nEnter your choice from below list.\n"+"1. Find palindrome of number.\n"
				+"2. Print Pattern for a given no.\n"+"3. Check whether the no is a  prime number.\n"
				+"4. Print Fibonacci series.\n"+"--> Enter 0 to Exit.\n");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: obj.checkPalindrome();break;
			case 2: obj.printPattern();break;
			case 3: obj.checkPrimeNumber();break;
			case 4: obj.printFibonacciSeries();break;
			case 0: System.out.println("You have successfully exited the program.");break;
			default: System.out.println("Invalid choice. Enter a valid no.\n");
			}
			
		}while(choice!=0);
		System.out.println("Exited Successfully!!!");
		sc.close();
		
	}
	public void checkPalindrome() {
		
		System.out.print("Enter the number to be checked: ");
		int num=sc.nextInt();
		int r, sum=0, temp;
		temp = num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Yes, its a palindrome number.");
		}
		else {
			System.out.println("No, its not a palindrome number.");
		}
		
	}
	public void printPattern() {
		
		System.out.println("Enter the number of stars in the first level: ");
		int row = sc.nextInt();
		for(int i=row;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}
	public void checkPrimeNumber(){
		
		System.out.println("Enter a number to check if its prime or not: ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				sum++;
			}
		}
		if(sum>=1) {
			System.out.println("No, its not a prime number.");
		}
		else {
			System.out.println("Yes, its a prime number.");
		}
		
	}
	public void printFibonacciSeries() {
		System.out.println("Enter a number: ");
		int count=sc.nextInt();
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;++i) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
}