package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int day = new int(int m,int w);
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if (day(i, w) != 0)
			{
				System.out.printf("%d\n",i);
			}
		}
	}

	public static int day(int m,int w)
	{
		int j;
		int x;
		int c = 0;
		for (j = 1;j <= m - 1;j++)
		{
			c = c + 31;
			if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				c--;
			}
			if (j == 2)
			{
				c = c - 3;
			}
		}
		c = c + 12;
		x = (c + w) % 7;
		if (x == 5)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

