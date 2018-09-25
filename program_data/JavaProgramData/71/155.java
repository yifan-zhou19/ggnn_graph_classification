package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int a;
		int b;
		int c;
		int i;
		int j;
		int t;
		int day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (b > c)
			{
				t = b;
				b = c;
				c = t;
			}
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				if (b > 2)
				{
					for (j = b - 1;j < c - 1;j++)
					{
						day += sz[j];
					}
				}
					if (c < 3)
					{
						day = 31;
					}
					if (b < 3 && c>2)
					{
						for (j = b - 1;j < c - 1;j++)
						{
						day += sz[j];
						}
						day += 1;
					}
			}
			else
			{
				  for (j = b - 1;j < c - 1;j++)
				  {
						day += sz[j];
				  }
			}
			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			day = 0;
		}
		return 0;
	}


}

