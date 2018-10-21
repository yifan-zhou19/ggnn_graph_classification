package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sum = new int[100];
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int max = 0;
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
		for (i = n - 1;i >= 0;i--)
		{
			if (i == n - 1)
			{
				sum[i] = 1;
			}
			else
			{
				for (j = i + 1;j <= n - 1;j++)
				{
					if (a[j] <= a[i])
					{
						if (sum[j] > max)
						{
							max = sum[j];
						}
					}
				}
				sum[i] = ++max;
				max = 0;
			}
		}
		max = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

