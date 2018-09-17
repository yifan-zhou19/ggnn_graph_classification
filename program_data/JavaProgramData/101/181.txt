package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		int D;
		int E;
		int F;
		for (a = 1; a <= 2; a++)
		{
			for (b = 1; b <= 2; b++)
			{
				for (c = 1; c <= 2; c++)
				{
					A = b > a;
					B = c == a;
					C = a > b;
					D = a > c;
					E = c > b;
					F = b > a;
					if ((A + B) * (D + C) * (E + F) == 0 && A + B + C + D + E + F == 3)
					{
						if (A + B == 2)
						{
							if (C + D == 0)
							{
								System.out.print("B");
								System.out.print("C");
								System.out.print("A");
								System.out.print("\n");
							}
							if (E + F == 0)
							{
								System.out.print("C");
								System.out.print("B");
								System.out.print("A");
								System.out.print("\n");
							}
						}
						if (D + C == 2)
						{
							if (A + B == 0)
							{
								System.out.print("A");
								System.out.print("C");
								System.out.print("B");
								System.out.print("\n");
							}
							if (E + F == 0)
							{
								System.out.print("C");
								System.out.print("A");
								System.out.print("B");
								System.out.print("\n");
							}
						}
						if (E + F == 2)
						{
							if (A + B == 0)
							{
								System.out.print("A");
								System.out.print("B");
								System.out.print("C");
								System.out.print("\n");
							}
							if (C + D == 0)
							{
								System.out.print("B");
								System.out.print("A");
								System.out.print("C");
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
				return 0;
	}



}
