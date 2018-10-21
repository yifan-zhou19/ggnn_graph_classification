package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int au = new int(int x,int y);
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		au(x, y);

	}
	public static int au(int x,int y)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i < x;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (j = 0;j < y;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[j] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < x;i++)
		{
			for (m = 0;m < x - i - 1;m++)
			{
				if (a[m] > a[m + 1])
				{
					int t = a[m];
					a[m] = a[m + 1];
					a[m + 1] = t;
				}
			}
		}
		for (j = 0;j < y;j++)
		{
			for (n = 0;n < y - j - 1;n++)
			{
				if (b[n] > b[n + 1])
				{
					int t = b[n];
					b[n] = b[n + 1];
					b[n + 1] = t;
				}
			}
		}
		for (m = x;m < x + y;m++)
		{
			a[m] = b[m - x];
		}
		for (m = 0;m < x + y - 1;m++)
		{
			System.out.printf("%d ",a[m]);
		}
		System.out.printf("%d",a[x + y - 1]);
	}

}

