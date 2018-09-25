package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int g;
		int d;
		int n;
		int i;
		int k = 0;
		int j;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sz[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				g = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if (g >= 90 && g <= 140 && d >= 60 && d <= 90)
			{
				sz[k] = sz[k] + 1;
			}
			else
			{
				k = k + 1;
			}
		}
		int e;
		for (q = 1;q < k + 1;q++)
		{
			for (j = 0;j < k + 1 - q;j++)
			{
				if (sz[j] < sz[j + 1])
				{
					e = sz[j + 1];
					sz[j + 1] = sz[j];
					sz[j] = e;
				}
			}
		}
		System.out.printf("%d",sz[0]);
		return 0;
	}



}

