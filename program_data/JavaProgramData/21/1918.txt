package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c = 0;
		int i;
		int j;
		int[] a = new int[300];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}

		double tot = 0;
		for (i = 0;i < n;i++)
		{
			tot += a[i];
		}
		tot = tot / n;
		double cha = 0;
		double tt;
		for (i = 0;i < n;i++)
		{
			 tt = a[i] - tot;
			if (tt < 0)
			{
				tt = -tt;
			}
			if (tt > cha)
			{
				cha = tt;
			}
		}
		for (i = 0;i < n;i++)
		{
			tt = a[i] - tot;
			if (tt < 0)
			{
				tt = -tt;
			}
			if (cha == tt)
			{
				if (c > 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",a[i]);
				c++;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

