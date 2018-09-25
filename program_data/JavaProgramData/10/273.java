package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
			int[] a = new int[25];
			int i;
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		int[] b = new int[25];
		int j;
		b[k - 1] = 1;
		if (a[k - 2] >= a[k - 1])
		{
			b[k - 2] = 2;
		}
		else
		{
			b[k - 2] = 1;
		}
		int max;

		for (j = k - 3;j >= 0;j--)
		{
			max = 0;
			for (i = j + 1;i <= k - 1;i++)
			{
				if (a[j] >= a[i] != 0 && b[i] >= max)
				{
					max = b[i];
				}
			}
			b[j] = max + 1;
		}

		max = 0;
		for (j = 0;j <= k - 1;j++)
		{
			if (b[j] > max)
			{
				max = b[j];
			}
		}
		System.out.printf("%d\n",max);

		return 0;
	}
}

