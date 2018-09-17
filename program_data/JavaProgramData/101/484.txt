package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				if (B == A)
				{
					continue;
				}
				else
				{
					C = 3 - B - A;
					a = (B > A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if ((a == (2 - A)) && (b == (2 - B)) && (c == (2 - C)))
					{
						if (A < B && A < C)
						{
							System.out.print("A");
							if (B < C)
							{
								System.out.print("B");
								System.out.print("C");
							}
							else
							{
								System.out.print("C");
								System.out.print("B");
							}
						}
						if (B < A && B < C)
						{
							System.out.print("B");
							if (A < C)
							{
								System.out.print("A");
								System.out.print("C");
							}
							else
							{
								System.out.print("C");
								System.out.print("A");
							}
						}
						if (C < B && C < A)
						{
							System.out.print("C");
							if (B < A)
							{
								System.out.print("B");
								System.out.print("A");
							}
							else
							{
								System.out.print("A");
								System.out.print("B");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
