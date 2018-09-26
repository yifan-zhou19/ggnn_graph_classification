package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[101];
	public static int[] b = new int[101];
	public static int m;
	public static int n;
	public static int input()
	{
		int i;
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
		for (i = 1;i <= m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		return (0);
	}
	public static int pai()
	{
		int i;
		int j;
		int p;
		for (j = 1;j < m;j++)
		{
			for (i = 1;i <= m - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					p = a[i];
					a[i] = a[i + 1];
					a[i + 1] = p;
				}
			}
		}
		for (j = 1;j < n;j++)
		{
			for (i = 1;i <= n - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					p = b[i];
					b[i] = b[i + 1];
					b[i + 1] = p;
				}
			}
		}
		return (0);
	}
	public static int print()
	{
		int i;
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n]);
		return (0);
	}
	public static void Main()
	{
		input();
		pai();
		print();
	}
}

