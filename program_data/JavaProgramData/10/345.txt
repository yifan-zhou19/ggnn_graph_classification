package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int dmax;
		int n;
		int[] array = new int[32];
		int[] d = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
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
				array[i] = Integer.parseInt(tempVar2);
			}
		}
		d[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((array[j] <= array[i]) && (d[i] < d[j] + 1))
				{
				   d[i] = d[j] + 1;
				}
			}
		}
		dmax = 0;
		for (i = 0;i < n;i++)
		{
			if (d[i] > dmax)
			{
				dmax = d[i];
			}
		}
		System.out.printf("%d",dmax);
	return 0;
	}

}

