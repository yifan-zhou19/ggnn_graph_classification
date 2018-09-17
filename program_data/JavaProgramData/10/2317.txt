package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int[] max = new int[100];
		int[] sum = new int[100];
		int final;
		final = 0;
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
		}
		for (i = 0;i < n;i++)
		{
		sum[i] = 0;
		}
		sum[n - 1] = 1;
		max[n - 1] = a[n - 1];
		for (i = n - 2;i >= 0;i--)
		{
			sum[i] = sum[n - 1];
			max[i] = max[n - 1];
			for (j = n - 1;j > i;j--)
			{
				if (a[i] >= max[j] != 0 && sum[i] <= sum[j] + 1)
				{
					sum[i] = sum[j] + 1;
					max[i] = a[i];
				}
			}
			if (sum[i] == 1 && a[i] < max[i])
			{
			max[i] = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (final <= sum[i])
			{
			final = sum[i];
			}
		}
		System.out.printf("%d",final);
	}
}

