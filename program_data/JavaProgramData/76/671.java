package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[51000];
		int[] b = new int[51000];
		int[] sz = new int[11000];
		int n;
		int i;
		int min;
		int max;
		int j;
		min = 10000;
		max = 1;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < 11000;i++)
		{
			sz[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
				if (b[i] > max)
				{
				max = b[i];
				}
			if (b[i] < min)
			{
				min = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 2 * a[i] - 2;j <= 2 * b[i] - 2;j++)
			{
				sz[j] = 1;
			}
		}
		i = 1;
		for (j = 2 * min - 2;j <= 2 * max - 2;j++)
		{
		if (sz[j] == 0)
		{
			i = 0;
		}
		}
		if (i != 0)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

