package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[51000];
		int[] b = new int[51000];
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		int k;
		int e;
		for (k = 1;k < n;k++)
		{
			for (i = 1;i <= n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
			}
		}
		int[] c = new int[51000];
		c[1] = a[1];
		for (i = 2,k = 2;i <= n;i++)
		{
			if (a[i] != a[i - 1])
			{
				c[k] = a[i];
				k++;
			}
		}
		k--;
		int j;
		int[] d = new int[51000];
		for (i = 1;i <= k;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[j] == c[i])
				{
					if (d[i] < b[j])
					{
						d[i] = b[j];
					}
				}
			}
		}
		for (i = 1;i < k;i++)
		{
			if (d[i] > d[i + 1])
			{
				d[i + 1] = d[i];
			}
		}
		int count = 0;
		for (i = 2;i <= k;i++)
		{
			if (c[i] <= d[i - 1])
			{
				count++;
			}
		}
		if (count == (k - 1))
		{
			System.out.printf("%d %d",c[1],d[k]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

