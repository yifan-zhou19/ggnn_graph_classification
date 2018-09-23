package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[25];
		int i;
		int[] b = new int[25];
		int j;
		int p;
		int max = 0;
		int q;
		int t;
	for (t = 0;t < 25;t++)
	{
		b[t] = 1;
	}
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
		b[k - 1] = 1;
		for (j = k - 2;j >= 0;j--)
		{
			for (p = j + 1;p < k;p++)
			{
				if (a[p] <= a[j] != 0 && b[j] < b[p] + 1)
				{
			b[j] = b[p] + 1;
				}
			}
		}
		for (q = 0;q < k;q++)
		{
			if (b[q] > max)
			{
				max = b[q];
			}
		}
		System.out.printf("%d",max);




			return 0;
	}


}

