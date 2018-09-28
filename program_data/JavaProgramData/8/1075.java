package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[233];
	public static int[] b = new int[233];
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int z;
	public static void shuru(int p)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[0] = Integer.parseInt(tempVar5);
		}
		for (i = 1;i < m;i++)
		{
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				b[i] = Integer.parseInt(tempVar6);
			}
		}
	}
	public static void paixu(int p)
	{
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					z = a[j];
					a[j] = a[j + 1];
					a[j + 1] = z;
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					z = b[j];
					b[j] = b[j + 1];
					b[j + 1] = z;
				}
			}
		}
	}
	public static void hebing(int p)
	{
		for (i = n;i < m + n;i++)
		{
			a[i] = b[i - n];
		}
	}
	public static void shuchu(int p)
	{
		System.out.printf("%d",a[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
	public static int Main()
	{
		shuru(0);
		paixu(0);
		hebing(0);
		shuchu(0);
	}
}

