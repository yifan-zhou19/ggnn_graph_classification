package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int i;
		int j;
		int t;
		int[] a = new int[100];
		int[] b = new int[100];
		int c = 0;
		for (i = 0;i <= m - 1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j <= m - 2;j++)
		{
			for (i = 0;i <= m - 2 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (j = 0;j <= n - 2;j++)
		{
			for (i = 0;i <= n - 2 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
		for (i = 0;i <= m - 1;i++,c++)
		{
			if (c != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a[i]);
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf(" %d",b[i]);
		}
		System.out.print("\n");
		return (0);
	}
	public static int Main()
	{
	int m;
	int n;
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
	f(m, n);
	}

}

