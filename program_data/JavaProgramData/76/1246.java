package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] c = new int[50000];
	public static int[] b = new int[10000];
	public static int[] d = new int[10000];
	public static int[] e = new int[10000];
	public static int Main()
	{

		int n;
		int x;
		int y;
		int i;
		int j;
		int p;
		int q;
		int m = 0;

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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			d[i] = a[i];
			e[i] = b[i];
		}

		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (d[i] <= d[i + 1])
				{
					x = d[i + 1];
					d[i + 1] = d[i];
					d[i] = x;
				}
				if (e[i] >= e[i + 1])
				{
					y = e[i + 1];
					e[i + 1] = e[i];
					e[i] = y;
				}
			}
		}
		p = d[n - 1];
		q = e[n - 1];

		for (i = p;i < q;i++)
		{
			c[i] = 0;
		}


		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j] = j;
			}
		}


		for (i = p;i < q;i++)
		{
			if (c[i] == 0)
			{
				m = m + 1;
			}
		}
		if (m == 0)
		{
			System.out.printf("%d %d",p,q);
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}
}

