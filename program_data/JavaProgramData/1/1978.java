package <missing>;

public class GlobalMembers
{
	public static int fg(int k,int m)
	{
		int j;
		int d = 0;
		if (m == 1)
		{
		   d = 1;
		}
		   for (j = k;j <= m;j++)
		   {
			if (m % j == 0)
			{
				d = d + fg(j, m / j);
			}
		   }
		return (d);
	}

	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[40000];
		int[] b = new int[40000];
		int s;
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
			b[i] = fg(2, a[i]);
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

