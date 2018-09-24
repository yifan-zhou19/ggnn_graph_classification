package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 1.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++
	//============================================================================


	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int i = 0;
		int p = 0;
		int q = 0;
		for (i = 1;i <= 3;i = i + 1)
		{
			  a = a + 1;
			 for (p = 1;p <= 3;p = p + 1)
			 {
				 b = b + 1;
				 for (q = 1;q <= 3;q = q + 1)
				 {
					 c = c + 1;
					 if (((b > a) + (c == a) + (a > b) + (a > c) + (c > b) + (b > a)) == 3)
					 {
						 if (((b > a) + (c == a)) == 0) //??A????????A????
						 {
							 System.out.print("A");
							 if ((a > b) + (a > c) == 1) //??B???????B????
							 {
								 System.out.print("BC");
							 }
							 else
							 {
								 System.out.print("CB");
							 }
							 return 0;
						 }
										  if ((a > b) + (a > c) == 0)
										  {
							 System.out.print("B");
							 if ((b > a) + (c == a) != 2)
							 {
								 System.out.print("CA");
							 }
							 else
							 {
								 System.out.print("AC");
							 }
							 return 0;

										  }
						 if (((c > b) + (b > a)) == 0)
						 {
							 System.out.print("c");
							 if ((a > b) + (a > c) == 1)
							 {
								 System.out.print("BA");
							 }
							 else
							 {
								 System.out.print("AB");
							 }
							 return 0;
						 }

					 }
				 }
			 }

		}
		return 0;

	}
}
