package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		for (k = 0;;k++)
		{
			int[] a = new int[300];
			int i = 0;
			int j = 0;
			int n = 0;
			int m = 0;
			int t = 0;
			int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if ((n == 0) && (m == 0))
		{
			break;
		}
		if (n == 1)
		{
			System.out.print("1\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
			a[i] = i + 1;
			}
			for (i = 0;;i++)
			{
				f = i;
				if (i > n - 1)
				{
					f = i % n;
				}
				if (a[f] > 0)
				{
					t = t + 1;
				}
				if (t % m == 0)
				{
					a[f] = 0;
				}
				if (t == (n - 1) * m)
				{
					break;
				}
			}
		for (i = 0;i < n;i++)
		{
			if (a[i] > 0)
			{
				System.out.printf("%d\n",a[i]);
			}
		}
		}
		}
				return 0;
	}
}

