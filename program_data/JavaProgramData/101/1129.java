package <missing>;

public class GlobalMembers
{
	/*
	 * Homework3.15CompareAppetite.cpp
	 *
	 *  Created on: 2013-10-28
	 *      Author: JuiceHe
	 */
	public static int Main()
	{
		void sort(int,int,int);
		int A; //A,B,C?????a,b,c????????
		int B;
		int C;
		int a;
		int b;
		int c;
		int i;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
			a = (B > A) + (A == C);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);
		 if ((a - b) * (A - B) < 0 && (c - b) * (C - B) < 0 && (a - c) * (A - C) < 0) //???????????
		 {
		 for (i = 1;i <= 3;i++) //????????????
		 {
			 if (A == i)
			 {
				 System.out.print("A");
			 }
		  if (B == i)
		  {
			  System.out.print("B");
		  }
		  if (C == i)
		  {
			  System.out.print("C");
		  }
		 }
		 }
				}
			}
		}

		return 0;
	}

}
