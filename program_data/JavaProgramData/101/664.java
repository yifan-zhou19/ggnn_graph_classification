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
		int t;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					A = (b > a) + (c == a);
					B = (b < a) + (c < a);
					C = (c > b) + (b > a);
					if (a + A == b + B && b + B == c + C)
					{
						if (a < b && a < c)
						{
							System.out.print('A');
						if (b < c)
						{
							System.out.print('B');
							System.out.print('C');
						}
						else
						{
							System.out.print('C');
							System.out.print('B');
						}
						}

						if (b < a && b < c)
						{
							System.out.print('B');
						if (a < c)
						{
							System.out.print('A');
							System.out.print('C');
						}
						else
						{
							System.out.print('C');
							System.out.print('A');
						}
						}
						if (c < a && c < b)
						{
							System.out.print('C');
						if (a < b)
						{
							System.out.print('A');
							System.out.print('B');
						}
						else
						{
							System.out.print('B');
							System.out.print('A');
						}
						}
					}

				}
			}
		}
		return 0;

	}
}
