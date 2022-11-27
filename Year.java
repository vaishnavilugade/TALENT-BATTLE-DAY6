import java.util.*;
class Year{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,y;
		System.out.println("Enter month:");
		n=sc.nextInt();
		System.out.println("Enter year:");
		y=sc.nextInt();
		switch(n)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println("number of days:31");
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println("number of days:30");
			break;
		}
		
		if(n==2 && y%4==0){
			System.out.println("number of days:29");
		}
		else if(n==2 && y%4!=0){
			System.out.println("number of days:28");
		}
		}
	}

		
		