package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					A = (b > a) + (c == a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if (!(a + A == 3 && b + B == 3 && c + C == 3))
					{
						continue;
					}
					if (A != B && A != C && B != C)
					{
						if (A + B + C == 3)
						{
							if (A == 2)
							{
								System.out.print("A");
							}
							if (B == 2)
							{
								System.out.print("B");
							}
							if (C == 2)
							{
								System.out.print("C");
							}
							if (A == 1)
							{
								System.out.print("A");
							}
							if (B == 1)
							{
								System.out.print("B");
							}
							if (C == 1)
							{
								System.out.print("C");
							}
							if (A == 0)
							{
								System.out.print("A");
							}
							if (B == 0)
							{
								System.out.print("B");
							}
							if (C == 0)
							{
								System.out.print("C");
							}
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
