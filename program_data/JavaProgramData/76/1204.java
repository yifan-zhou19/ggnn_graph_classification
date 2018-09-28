package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int f;
		int c;
		int d;
		int m;
		int sum = 0;
		int[] a = new int[50000];
		int[] b = new int[50000];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
				e = a[i + 1];
				a[i + 1] = a[i];
				a[i] = e;
				f = b[i + 1];
				b[i + 1] = b[i];
				b[i] = f;
				}
			}
		}
		m = b[0];
		for (i = 0;i < n;i++)
		{
			if (m < b[i])
			{
				m = b[i];
			}
		}
		c = a[0];
		d = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] <= d != 0 && b[i]> d)
			{
				d = b[i];
			}
		}
		if (d == m)
		{
			System.out.printf("%d %d",c,d);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

