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
		//	?????????
		for (a = 0; a <= 2; a++)
		{
			for (b = 0; b <= 2; b++)
			{
				for (c = 0; c <= 2; c++)
				{
					A = b > a;
					B = c == a;
					C = a > b;
					D = a > c;
					E = c > b;
					F = b > a;
					//	??????????????2????????
					if (A + B + a == 2 && C + D + b == 2 && E + F + c == 2)
					{
						if (A + B == 0)
						{
							if (C + D == 2)
							{
								System.out.print("B");
								System.out.print("C");
								System.out.print("A");
								System.out.print("\n");
							}
							if (E + F == 2)
							{
								System.out.print("C");
								System.out.print("B");
								System.out.print("A");
								System.out.print("\n");
							}
						}
						if (D + C == 0)
						{
							if (A + B == 2)
							{
								System.out.print("A");
								System.out.print("C");
								System.out.print("B");
								System.out.print("\n");
							}
							if (E + F == 2)
							{
								System.out.print("C");
								System.out.print("A");
								System.out.print("B");
								System.out.print("\n");
							}
						}
						if (E + F == 0)
						{
							if (A + B == 2)
							{
								System.out.print("A");
								System.out.print("B");
								System.out.print("C");
								System.out.print("\n");
							}
							if (C + D == 2)
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
