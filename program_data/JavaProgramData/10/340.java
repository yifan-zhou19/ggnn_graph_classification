package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x,int y,int b[]);
		int i;
		int k;
		int[] a = new int[30];
		int max;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0,max = 0;i < k;i++)
		{
			if (f(i, k, a) >= max)
			{
				max = f(i, k, a);
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
	public static int f(int x, int y, int[] b)
	{
		int z;
		int i;
		int p;
		int m;
		for (i = x + 1,p = 0;i < y;i++)
		{
			if (b[i] <= b[x]) //only compare with b[x]
			{
				p++;
			}
		}
		if (p == 0)
		{
			z = 1;
		}
		else
		{
			for (i = x + 1,m = 0;i < y;i++)
			{
				if (b[i] <= b[x])
				{
					if (m <= f(i, y, b))
					{
						m = f(i, y, b); // after m there are f nums<b[i]
					}
				}
			}
			z = m + 1;
		}
		return z;
	}

}

