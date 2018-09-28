package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[500];
		int i;
		int j;
		int k;
		int m;
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
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0,k = 0;i < n;i++)
		{
			if (x[i] % 2 != 0)
			{
				x[k] = x[i];
				k = k + 1;
			}
		}
		for (i = 1;i <= k - 1;i++)
		{
			for (j = i + 1;j <= k;j++)
			{
				if (x[i - 1] > x[j - 1])
				{
					m = x[i - 1];
					x[i - 1] = x[j - 1];
					x[j - 1] = m;
				}
			}
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%d",x[i - 1]);
			if (i < k)
			{
				System.out.print(",");
			}
		}



		return 0;
	}
}

