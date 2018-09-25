package <missing>;

public class GlobalMembers
{
	public static int D(int[] h, int i, int n)
	{
		int j;
		int z = 1;
		int x;
		if (i < n)
		{
			for (j = i + 1;j < n + 1;j++)
			{
				if (h[j - 1] <= h[i - 1])
				{
					x = D(h, j, n) + 1;
					if (z < x)
					{
						z = x;
					}
				}
			}
		}
		return z;
	}
	public static int Main()
	{
		int i;
		int n;
		int z = 1;
		int[] h = new int[25];
		int x;
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
				h + i = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			x = D(h, i + 1, n);
			if (z < x)
			{
				z = x;
			}
		}
		System.out.printf("%d",z);
		return 0;
	}
}

