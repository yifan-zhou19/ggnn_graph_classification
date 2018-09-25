package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[NUM];
		int[] d = new int[NUM];
		int k;
		int i;
		int j;
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
		d[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
			max = 0;
			for (j = k - 1;j > i;j--)
			{
				if (a[j] <= a[i])
				{
					if (d[j] > max)
					{
						max = d[j];
					}
				}
			}
			d[i] = max + 1;
		}
		//?d[]????
		max = d[0];
		for (i = 1;i < k;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

