package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int e;
		int f;
		int[] c = new int[99];
		int[] d = new int[99];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		c[0] = a;
		d[0] = b;
		for (i = 0;i <= 100;i++)
		{
			if (c[i] % 2 == 0)
			{
				c[i + 1] = c[i] / 2;
			}
			else
			{
				c[i + 1] = (c[i] - 1) / 2;
			}
			if (c[i] == 1)
			{
				break;
			}
		}
		for (j = 0;j <= 100;j++)
		{
			if (d[j] % 2 == 0)
			{
				d[j + 1] = d[j] / 2;
			}
			else
			{
				d[j + 1] = (d[j] - 1) / 2;
			}
			if (d[j] == 1)
			{
				break;
			}
		}
		int g = 0;
		for (e = 0;e <= i;e++)
		{
			for (f = 0;f <= j;f++)
			{
				if (c[e] == d[f])
				{
					System.out.printf("%d\n",c[e]);
					g = 1;
				}
			}
			if (g == 1)
			{
				break;
			}
		}


	}
}

