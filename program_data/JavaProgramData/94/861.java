package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int[] z = new int[1000];
		int[] x = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a <= n - 1;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[a] = Integer.parseInt(tempVar2);
			}
		}
		a = 0;
		b = 0;
		while (a <= n - 1)
		{
			if (z[a] % 2 != 0)
			{
			x[b] = z[a];
			b = b + 1;
			}
			a = a + 1;
		}
		for (a = 0;a <= b - 1;a++)
		{
			for (c = 0;c < b - 1 - a;c++)
			{
				if (x[c] > x[c + 1])
				{
					d = x[c];
					x[c] = x[c + 1];
					x[c + 1] = d;
				}
			}
		}
		for (a = 0;a <= b - 1;a++)
		{
			if (a <= b - 2)
			{
			System.out.printf("%d,",x[a]);
			}
			else
			{
				System.out.printf("%d",x[a]);
			}
		}
		return 0;
	}


}

