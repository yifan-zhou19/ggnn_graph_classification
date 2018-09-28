package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int a;
		int b;
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N <= 4)
		{
			System.out.print("empty\n");
		}
		for (a = 3;a <= N - 2;a = a + 2)
		{
			i = 1;
			for (b = 2;b <= a / 2;b++)
			{
				if (a % b == 0)
				{
					i = 0;
					break;
				}
			}
				if (i == 1)
				{
					m = a + 2;
					j = 1;
					for (n = 2;n <= m / 2;n++)
					{
						if (m % n == 0)
						{
							j = 0;
							break;
						}
					}
				}
				if (i == 1 && j == 1)
				{
				System.out.printf("%d %d\n",a,m);
				}
		}

	}
}

