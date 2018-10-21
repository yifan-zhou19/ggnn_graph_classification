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
		A = B = C = 0;
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 0;c < 3;c++)
				{
					if (a == c || b == c)
					{
						continue;
					}
					A = B = C = 0;
					if (b > a)
					{
						A++;
					}
					if (b == a)
					{
						A++;
					}
					if (a > b)
					{
						B++;
					}
					if (a > c)
					{
						B++;
					}
					if (c > b)
					{
						C++;
					}
					if (b > a)
					{
						C++;
					}
					if ((A + a == B + b) && (A + a == C + c))
					{
						if (a == 0)
						{
							System.out.print('A');
						}
						if (b == 0)
						{
							System.out.print('B');
						}
						if (c == 0)
						{
							System.out.print('C');
						}
						if (a == 1)
						{
							System.out.print('A');
						}
						if (b == 1)
						{
							System.out.print('B');
						}
						if (c == 1)
						{
							System.out.print('C');
						}
						if (a == 2)
						{
							System.out.print('A');
						}
						if (b == 2)
						{
							System.out.print('B');
						}
						if (c == 2)
						{
							System.out.print('C');
						}
					}
				}
			}
		}
		return 0;
	}
}
