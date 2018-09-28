package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int t;
		int n;
		int m;
		int f = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (i = 1,t = 1,m = 1;i <= n - 1;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[i] != a[j])
				{
					f = 1;
				}
				if (a[i] == a[j])
				{
					f = 0;
					 break;
				}
			}
			if (f == 1)
			{
				m = m + 1;
				b[t] = a[i];
				t++;
			}
		}

	for (t = 0;t <= m - 2;t++)
	{
		System.out.printf("%d,",b[t]);
	}
	System.out.printf("%d",b[m - 1]);
	}

}

