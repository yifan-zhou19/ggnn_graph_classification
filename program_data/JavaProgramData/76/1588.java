package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[10001];
		int n;
		int i;
		int j;
		int k;
		int s = 0;
		int p;
		int q;
		int l;
		int u;
		int x = 10000;
		int d = 0;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= 10000;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			k = b[i];
			l = a[i];
			for (j = l + 1;j <= k;j++)
			{
				c[j] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < x)
			{
				x = a[i];
			}
		}
		c[x] = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > d)
			{
				d = b[i];
			}
		}
		for (i = x;i <= d;i++)
		{
			if (c[i] == 1)
			{
				s++;
			}
		}
		if (n >= 3)
		{
			if (s > 0)
			{
				System.out.print("no");
			}
			if (s == 0)
			{
				System.out.printf("%d %d",x,d);
			}
		}
		if (n < 3)
		{
			System.out.print("no");
		}
		return 0;
	}




}

