package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int k;
		int e;
		int n;
		double j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
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
			c[i] = a[i];
			d[i] = b[i];
		}

		for (k = 1; k <= n; k++)
		{
			for (i = 0; i < n - k; i++)
			{
				if (c[i] > c[i + 1])
				{
					e = c[i + 1];
					c[i + 1] = c[i];
					c[i] = e;
				}
				if (d[i] > d[i + 1])
				{
					e = d[i + 1];
					d[i + 1] = d[i];
					d[i] = e;
				}
			}
		}

		if (c[0] > d[0])
		{
			c[0] = d[0];
		}
		if (c[n - 1] < d[n - 1])
		{
			c[n - 1] = d[n - 1];
		}
		for (j = c[0]; j <= c[n - 1]; j = j + 0.5)
		{
			k = 1;
			for (i = 0; i < n; i++)
			{
				if (j <= b[i] != 0 && j >= a[i])
				{
					k = 0;
				}
			}
			if (k == 1)
			{
				System.out.print("no");
				break;
			}
		}
		if (k == 0)
		{
		System.out.printf("%d %d", c[0], c[n - 1]);
		}





		return 0;
	}
}

