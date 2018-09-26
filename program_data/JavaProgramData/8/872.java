package <missing>;

public class GlobalMembers
{
	public static void get(int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void swap(int m, int n)
	{
		int j;
		int k;
		int c;
		for (j = 0;j < m - 1;j++)
		{
			for (k = 0;k < m - 1 - j;k++)
			{
				if (a[k] > a[k + 1])
				{
					c = a[k];
					a[k] = a[k + 1];
					a[k + 1] = c;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (k = 0;k < n - 1 - j;k++)
			{
				if (b[k] > b[k + 1])
				{
					c = b[k];
					b[k] = b[k + 1];
					b[k + 1] = c;
				}
			}
		}
	}
	public static void put(int m, int n)
	{
		int l;
		for (l = 0;l < m;l++)
		{
			System.out.printf("%d ",a[l]);
		}
		for (l = 0;l < n;l++)
		{
			if (l == n - 1)
			{
				System.out.printf("%d",b[l]);
			}
			else
			{
				System.out.printf("%d ",b[l]);
			}
		}
	}
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];
	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		get(m, n);
		swap(m, n);
		put(m, n);
	}
}

