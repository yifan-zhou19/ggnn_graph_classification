package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int c;
		int n;
		int[] sz = new int[200];
		x = 0;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= (n * 2);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= (n * 2 - 1);i += 2)
		{
			if (sz[i] >= 90 && sz[i] <= 140 && sz[(i + 1)] <= 90 && sz[(i + 1)] >= 60)
			{
				x++;
			}
			else
			{
				if (x >= c)
				{
				c = x;
			x = 0;
				}
				x = 0;
			}
		}
		if (x >= c)
		{
				c = x;
			x = 0;
		}
			System.out.printf("%d", c);
			return 0;

	}

}

