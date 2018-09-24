package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[25];
		int[] h = new int[25];
		int k;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			a[i] = zuo(i, k, h) + you(i, k, h) - 1;
			if (a[i] > t)
			{
				t = a[i];
			}
		}
		System.out.printf("%d",t);
		return 0;
	}
	public static int zuo(int i, int k, int[] h)
	{
		int t = 1;
		int j;
		int m = 0;
		int s = 0;
		if (i != 0)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (h[j] >= h[i])
				{
					m = zuo(j, k, h);
					if (m > s)
					{
						s = m;
					}
				}
			}
			t += m;
		}
		return t;
	}
	public static int you(int i, int k, int[] h)
	{
		int t = 1;
		int j;
		int m = 0;
		int s = 0;
		if (i != k - 1)
		{
			for (j = i + 1;j < k;j++)
			{
				if (h[j] <= h[i])
				{
					m = you(j, k, h);
					if (m > s)
					{
						s = m;
					}
				}
			}
			t += s;
		}
		return t;
	}
}

