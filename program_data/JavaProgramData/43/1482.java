package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int s = 0;
		int i;
		int m;
		int n;
		int j;
		int g;
		int k;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= x - 1;i++)
		{
			s = 0;
				for (j = 2;j <= i - 1;j++)
				{
					if (i % j == 0)
					{
						s = 1;
					}
				}
			if (s == 0)
			{
				t = 0;
				g = x - j;
				if (g >= j)
				{
					for (k = 2;k <= g - 1;k++)
					{
						if (g % k == 0)
						{
							t = 1;
						}
					}
					if (t == 0)
					{
						System.out.printf("%d %d\n",i,g);
					}
				}
			}
		}
		return 0;
	}

}

