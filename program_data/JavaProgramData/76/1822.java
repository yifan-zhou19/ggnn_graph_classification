package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int f;
		int n;
		int i;
		double e;
		int[] a = new int[50000];
		int[] b = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[n - 1] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[n - 1] = Integer.parseInt(tempVar5);
		}
		for (i = 0,c = 10001;i < n;i++)
		{
			if (c > a[i])
			{
				c = a[i];
			}
		}
		for (i = 0,d = 0;i < n;i++)
		{
			if (d < b[i])
			{
				d = b[i];
			}
		}
		for (e = c + 0.5;e < d;e++)
		{
			for (i = 0,f = 0;i < n;i++)
			{
				if (e > a[i] && e < b[i])
				{
					f = 1;
				}
			}
			if (f == 0)
			{
				break;
			}
		}
		if (f == 1)
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

