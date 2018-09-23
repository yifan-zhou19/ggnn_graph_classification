package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int f = 0;
		int[] g = new int[1000];

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i = 0;
		while (i < n)
		{
			int k = 0;
			while (k < n)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					e = Integer.parseInt(tempVar2);
				}
				if (e == 0)
				{
					f++;
				}
				k++;
			}

			g[i] = f;
			f = 0;
			i++;
		}

		int m = 0;
		int x;
		int y;
		int j = 0;
		while (j < n)
		{
			if (g[j] > m)
			{
				m = g[j];
			}
			if (g[j] == 0 && g[j + 1] != 0)
			{
				x = j;
			}
			if (g[j] != 0 && g[j + 1] == 0)
			{
				y = j;
			}
			j++;
		}

		int d;
		int sum;
		d = y - x;
		sum = (m - 2) * (d - 2);
		System.out.printf("%d\n",sum);
		return 0;
	}

}

