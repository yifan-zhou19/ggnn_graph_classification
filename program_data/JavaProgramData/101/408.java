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
		int i;
		for (a = 0; a <= 2; a++)
		{
			for (b = 0; b <= 2; b++)
			{
				for (c = 0; c <= 2; c++)
				{
					A = (b > a) + (a == c) + a;
					B = (a > b) + (a > c) + b;
					C = (c > b) + (b > a) + c;
					if (A == B && B == C)
					{
						for (i = 0; i <= 2; i++)
						{
							if (a == i)
							{
								System.out.print('A');
							}
							if (b == i)
							{
								System.out.print('B');
							}
							if (c == i)
							{
								System.out.print('C');
							}
						}
						System.out.print("\n");
					}
				}
			}
		}
	}
}
