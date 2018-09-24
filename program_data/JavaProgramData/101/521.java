package <missing>;

public class GlobalMembers
{
	//*************************************
	//*  ???                           *
	//*  ??????                     *
	//*  ?????2011?10?18?         *
	//*************************************
	public static int Main()
	{
		int A; //ABC??????????
		int B;
		int C;
		int a; //abc??????????
		int b;
		int c;
		for (A = 1;A <= 3;A = A + 1)
		{
			for (B = 1;B <= 3;B = B + 1)
			{
				for (C = 1;C <= 3;C = C + 1) //???????123???
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if (a + A == 3 && b + B == 3 && c + C == 3 && A != B && A != C && B != C)
					{
						//??????????????????,???????
						if (a > b && b > c)
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
							System.out.print("\n");
						}
						else if (a > c && c > b)
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
							System.out.print("\n");
						}
						else if (b > a && a > c)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
							System.out.print("\n");
						}
						else if (b > c && c > a)
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
							System.out.print("\n");
						}
						else if (c > a && a > b)
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
							System.out.print("\n");
						}
						else
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
							System.out.print("\n");
						}
					}
				}
			}
		}
				return 0;
	}
}
