package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[M];
		int[] b = new int[M];
		int i;
		int j;
		int e;
		int t;
		int p;
		int s;
		s = 0;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			scanf("\n");
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
				if (b[i] > b[i + 1])
				{
					t = b[i + 1];
					b[i + 1] = b[i];
					b[i] = t;
				}
			}
		}
		m = a[0] + 0.5;
		for (;m < b[n - 1];m++)
		{
			p = 0;
			for (i = 0;i < n;i++)
			{
				if (m > a[i] && m < b[i])
				{
					p = p + 1;
				}
			}
			if (p > 0)
			{
				s = s + 1;
			}
		}
		if (s == b[n - 1] - a[0])
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		   return 0;
	}



}

