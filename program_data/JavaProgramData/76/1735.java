package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}
		int min = a[0];
		for (int m = 0;m < n - 1;m++)
		{
			if (min > a[m + 1])
			{
				min = a[m + 1];
			}
		}
		int max = b[0];
		for (int k = 0;k < n - 1;k++)
		{
			if (max < b[k + 1])
			{
				max = b[k + 1];
			}
		}
		int i = 0;
		double ts;
		for (i = min;i < max;i++)
		{
			sz[i] = 0;
			ts = 1.0 * i + 0.5;
			for (int t = 0;t < n;t++)
			{
				if ((ts <= b[t]) && (ts >= a[t]))
				{
					sz[i] = 1;
					break;
				}
			}
		}
		int ans = sz[min];
		for (i = min + 1;i < max;i++)
		{
			ans *= sz[i];
		}
		if (ans == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

