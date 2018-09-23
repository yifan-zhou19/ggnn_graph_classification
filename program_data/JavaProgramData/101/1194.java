package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : prac-0106.cpp
	// Author      : yintao
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================

	public static int Main()
	{
	int A;
	int B;
	int C;
	int a;
	int b;
	int c;
	for (A = 0;A <= 2;A++)
	{
	   for (B = 0;B <= 2;B++)
	   {
		for (C = 0;C <= 2;C++)
		{
		 a = (B > A) + (C == A);
		 b = (A > B) + (A > C);
		 c = (C > B) + (B > A);
	  if ((a + A == 2) && (b + B == 2) && (c + C == 2))
	  {
		  if (A == 2)
		  {
			  if (B == 1)
			  {
				System.out.print("CBA");
				System.out.print("\n");
			  }
			  System.out.print("BCA");
			  System.out.print("\n");
		  }
		  else if (B == 2)
		  {
			  if (A == 1)
			  {
			  System.out.print("CAB");
			  System.out.print("\n");
			  }
			  System.out.print("ACB");
			  System.out.print("\n");
		  }
		  else
		  {
			  if (A == 1)
			  {
			  System.out.print("BAC");
			  System.out.print("\n");
			  }
			  System.out.print("ABC");
			  System.out.print("\n");
		  }
	  }
		}
	   }
	}
	return 0;
	}

}
