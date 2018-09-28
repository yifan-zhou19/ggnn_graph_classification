package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
		if (60 <= a[k] + 3 * (k - 1) && 58 <= a[k - 1] + 3 * (k - 2) && a[k - 1] + 3 * (k - 2) <= 60)
		{
			sum[i] = a[k - 1];
		}
		else if (60 <= a[k] + 3 * (k - 1) && a[k - 1] + 3 * (k - 2) <= 57)
		{
			sum[i] = 60 - 3 * (k - 1);
		}
		else if (58 <= a[k] + 3 * (k - 1) && a[k] + 3 * (k - 1) <= 60)
		{
			sum[i] = a[k];
		}
		else if (a[k] + 3 * (k - 1) <= 57)
		{
			sum[i] = 60 - 3 * k;
		}
		else
		{
			sum[i] = 60 - 3 * (k - 2);
		}
		System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}

}

