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
						 if ((a > b) && (b > c))
						 {
							 System.out.print("ABC");
							 System.out.print("\n");
							 return 0;
						 }
						 else if ((a > c) && (c > b))
						 {
							 System.out.print("ACB");
							 System.out.print("\n");
							 return 0;
						 }
						 else if ((b > c) && (c > a))
						 {
							 System.out.print("BCA");
							 System.out.print("\n");
							 return 0;
						 }
						 else if ((b > a) && (a > c))
						 {
							 System.out.print("BAC");
							 System.out.print("\n");
							 return 0;
						 }
						 else if ((c > b) && (b > a))
						 {
							 System.out.print("BCA");
							 return 0;

						 }
						 else if ((c > a) && (a > b))
						 {
							 System.out.print("CAB");
							 return 0;
						 }

					 }
				 }
			 }

		}
		return 0;

	}

}
