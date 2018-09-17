package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[100];
		int i = 0;
		int j = 0;
		int[] d = new int[100];
		int c = 0;
		int max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
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
			for (j = k - 1;j > i;j--)
			{
				if ((d[j] > c) && (a[j] <= a[i]))
				{
					c = d[j];
				}
			}
			d[i] = c + 1;
			c = 0;
		}
		for (i = 0;i <= k - 1;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.printf("%d",max);
	}
}

