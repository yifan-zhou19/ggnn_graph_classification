package <missing>;

public class GlobalMembers
{
	/*
	 * compare2.cpp
	 *
	 *  Created on: 2012-10-28
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		a = 1;
		b = 2;
		c = 3;
		sum1 = (b > a) + (a == c) + a;
		sum2 = (a > b) + (a > c) + b;
		sum3 = (c > b) + (b > a) + c;
		if (sum1 == 3 && sum2 == 3 && sum3 == 3)
		{
			System.out.print("A");
			System.out.print("B");
			System.out.print("C");
		}
		else
		{
			a = 1;
		}
		b = 3;
		c = 2;
			sum1 = (b > a) + (a == c) + a;
			sum2 = (a > b) + (a > c) + b;
			sum3 = (c > b) + (b > a) + c;
			if (sum1 == 3 && sum2 == 3 && sum3 == 3)
			{
				System.out.print("A");
				System.out.print("C");
				System.out.print("B");
			}
			else
			{
				a = 2;
			}
			b = 1;
			c = 3;
			sum1 = (b > a) + (a == c) + a;
			sum2 = (a > b) + (a > c) + b;
			sum3 = (c > b) + (b > a) + c;
			if (sum1 == 3 && sum2 == 3 && sum3 == 3)
			{
				System.out.print("B");
				System.out.print("A");
				System.out.print("C");
			}
			else
			{
				a = 2;
			}
			b = 3;
			c = 1;
			sum1 = (b > a) + (a == c) + a;
			sum2 = (a > b) + (a > c) + b;
			sum3 = (c > b) + (b > a) + c;
			if (sum1 == 3 && sum2 == 3 && sum3 == 3)
			{
				System.out.print("C");
				System.out.print("A");
				System.out.print("B");
			}
			else
			{
				a = 3;
			}
			b = 2;
			c = 1;
			sum1 = (b > a) + (a == c) + a;
			sum2 = (a > b) + (a > c) + b;
			 sum3 = (c > b) + (b > a) + c;
			 if (sum1 == 3 && sum2 == 3 && sum3 == 3)
			 {
				 System.out.print("C");
				 System.out.print("B");
				 System.out.print("A");
			 }
			 else
			 {
				 a = 3;
				 b = 1;
				 c = 2;
				sum1 = (b > a) + (a == c) + a;
				sum2 = (a > b) + (a > c) + b;
				sum3 = (c > b) + (b > a) + c;
			   if (sum1 == 3 && sum2 == 3 && sum3 == 3)
			   {
				 System.out.print("B");
				 System.out.print("C");
				 System.out.print("A");
			   }
			 }
		   return 0;
	}
}
