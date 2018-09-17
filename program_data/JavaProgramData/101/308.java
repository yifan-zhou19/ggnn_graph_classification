package <missing>;

public class GlobalMembers
{
	/**
	@ file 1000012907_4.cpp
	@ author ???
	@ date 2010-11-21
	@ description
	@ ?????????? 
	*/
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int max = 0;
		int min = 0;
		int mid = 0;
		int temp = 0;
		for (A = 0; A < 3; A++) // A??A??????0?????2????
		{
			for (B = 0; B < 3; B++) // B??B??????0?????2????
			{
				for (C = 0; C < 3; C++) // C??C??????0?????2????
				{
					a1 = (B > A); // a1?a2??A???????b1?b2??B???????c1?c2??C??????
					a2 = (C == A);
					b1 = (A > B);
					b2 = (A > C);
					c1 = (C > B);
					c2 = (B > A);
					// ????????????????
					if (a1 + a2 + A == 2 && b1 + b2 + B == 2 && c1 + c2 + C == 2)
					{
						if (A < B && B < C) // ???????????????
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
						}
						if (A < C && C < B)
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
						}
						if (B < A && A < C)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
						}
						if (B < C && C < A)
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
						}
						if (C < B && B < A)
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
						}
						if (C < A && A < C)
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
						}
					}
				}
			}
		}
		return 0;
	}

}
