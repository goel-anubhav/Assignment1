package groupclass;

import java.util.Scanner;

public class groupclass {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input roll number ");
		int roll = sc.nextInt();
		int x=1,b=2,c=3,d=4;
		int a=0;
		do
		{
			if(roll==x)
			{
				System.out.println("Sapphire ");
				a=1;
			}
			if(roll==b)
			{
				System.out.println("Pearl ");
				a=1;
			}
			if(roll==c)
			{
				System.out.println("Ruby ");
				a=1;
			}
			if(roll==d)
			{
				System.out.println("Emerald");
				a=1;
			}
			x+=4;
			b+=4;
			c+=4;
			d+=4;
		}while(a==0);
	}
}