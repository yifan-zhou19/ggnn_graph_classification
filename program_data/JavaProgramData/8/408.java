package <missing>;

public class GlobalMembers
{
	public static void px(int[] a, int n)
	{
		int i;
		int j;
		int x;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
	}
	public static void hb(int[] a, int m, int[] b, int n)
	{
		int[] c = new int[1000];
		int i;
		int j;
		int k;
		for (i = 0;i <= m - 1;i++)
		{
			c[i] = a[i];
		}
		for (j = m;j <= m + n - 1;j++)
		{
			c[j] = b[j - m];
		}
		for (k = 0;k < m + n - 1;k++)
		{
			System.out.printf("%d ",c[k]);
		}
		System.out.printf("%d",c[m + n - 1]);
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] a = new int[1000];
		for (i = 0;i <= m - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] b = new int[1000];
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		px(a, m);
		px(b, n);
		hb(a, m, b, n);
		return 0;
	}

}

