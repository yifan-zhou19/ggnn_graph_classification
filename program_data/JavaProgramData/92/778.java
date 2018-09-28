package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[1002];
		int[] b = new int[1002];
		int i;
		int j;
		int k;
		int l;
		int max = -200001;
		int m = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[j] > a[i])
				{
					l = a[i];
					a[i] = a[j];
					a[j] = l;
				}
				if (b[j] > b[i])
				{
					l = b[i];
					b[i] = b[j];
					b[j] = l;
				}
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 1;i <= n;i++)
			{
				if (a[i] > b[i])
				{
					m = m + 200;
				}
				else if (a[i] < b[i])
				{
					m = m - 200;
				}
			}
			if (m > max)
			{
				max = m;
			}
			for (i = n;i >= 1;i--)
			{
				a[i + 1] = a[i];
			}
			a[1] = a[n + 1];
			m = 0;
		}
		System.out.printf("%d",max);
		max = -200001;
		for (;;)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		if (n == 0)
		{
			break;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i] = Integer.parseInt(tempVar5);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[i] = Integer.parseInt(tempVar6);
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[j] > a[i])
				{
					l = a[i];
					a[i] = a[j];
					a[j] = l;
				}
				if (b[j] > b[i])
				{
					l = b[i];
					b[i] = b[j];
					b[j] = l;
				}
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 1;i <= n;i++)
			{
				if (a[i] > b[i])
				{
					m = m + 200;
				}
				else if (a[i] < b[i])
				{
					m = m - 200;
				}
			}
			if (m > max)
			{
				max = m;
			}
			for (i = n;i >= 1;i--)
			{
				a[i + 1] = a[i];
			}
			a[1] = a[n + 1];
			m = 0;
		}
		System.out.printf("\n%d",max);
		max = -200001;
		}
	}


}

