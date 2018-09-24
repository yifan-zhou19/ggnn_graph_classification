package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[1000];
		int b;
		int c;
		int d;
		int e;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		i = 1;
		a[0] = 3;
		for (b = 5;b <= 15 + m / 2;b = b + 2)
		{
			c = 0;
			for (d = 2;d <= Math.sqrt(b);d++)
			{
				if (b % d == 0)
				{
					c++;
				}
			}
			if (c == 0)
			{
				a[i] = b;
				i++;
			}
		}
		b = i;
		for (e = 0;a[e] <= m / 2;e++)
		{
			i = m - a[e];
			c = 0;
			for (d = 2;d <= Math.sqrt(i);d++)
			{
				if (i % d == 0)
				{
					c++;
				}
			}
			if (c == 0)
			{
				System.out.printf("%d %d\n",a[e],i);
			}
		}
		return 0;
	}

}

