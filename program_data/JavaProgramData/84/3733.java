package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int u;
		int max = 0;
		int max2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j <= n;j++)
		{
			if (max < a[j - 1])
			{
				max = a[j - 1];
			}
			else
			{
				max = max;
			}
		}
		for (u = 1;u <= n;u++)
		{
			if (max2 < a[u - 1] && max> a[u - 1])
			{
				max2 = a[u - 1];
			}
			else
			{
				max2 = max2;
			}
		}

		System.out.printf("%d\n",max);
		System.out.printf("%d\n",max2);
		return 0;
	}

}

