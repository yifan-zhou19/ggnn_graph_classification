package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 6;
		int j = 3;
		int a = 2;
		int b;
		int m = 0;
		int x = 0;
		int y = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6; i <= n; i++)
		{
			if (i % 2 == 0)
			{
				for (j = 3; j <= i / 2; j++)
				{
					m = 0;
					for (a = 2; a <= (int)Math.sqrt(j); a++)
					{
						if (j % a == 0)
						{
							m = 1;
							a = 2 * i;
						}
					}
				   if (m == 0)
				   {
					b = i - j;
					x = 0;
					for (y = 2; y <= (int)Math.sqrt(b); y++)
					{
						if (b % y == 0)
						{
							x = 1;
							y = 2 * b;
						}
					}
					if (x == 0)
					{
						System.out.printf("%d=%d+%d\n", i, j, b);
							j = 2 * i;
					}
				   }
				}
			}
		}
		return 0;
	}
}

