package <missing>;

public class GlobalMembers
{
	/*
	 * bifanliang.cpp
	 *
	 *  Created on: 2012-10-21
	 *      Author: ??
	 *      ????????3??????
	 */


	public static int Main()
	{
		 int A; //????
		 int B;
		 int C;
		 int i;

		 for (A = 0; A <= 2 ;A++)
		 {
			for (B = 0; B <= 2 ;B++)
			{
			  for (C = 0 ;C <= 2 ;C++)
			  {
				  for (i = 0 ;i <= 2 ;i++) //A,B,C??????
				  {

		  if ((B > A) + (C == A) + A == 2 && (A > B) + (A > C) + B == 2 && (C > B) + (B > A) + C == 2) //????????????????
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
		  } //????????
				  }
			  }
			}
		 }

		 return 0;

	}

}
