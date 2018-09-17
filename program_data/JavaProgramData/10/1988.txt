package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		int p;
		int q;
		int tmp;
		int tmpmax;
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
			b[i] = 1;
		}
		for (p = 1;p < k;p++)
		{
			for (q = 0;q < p;q++)
			{
				if (a[p] <= a[q])
				{
					tmp = b[q] + 1;
					if (tmp > b[p])
					{
						b[p] = tmp;
					}
				}
			}
		}
		max = 1;
		for (j = 1;j < k;j++)
		{
			if (b[j] > max)
			{
				max = b[j];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

