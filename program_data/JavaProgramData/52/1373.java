package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int k;
		int t;
		int u;
		int i;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = Integer.parseInt(tempVar3);
		}
		for (k = 1;k <= n - 1;k++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[k] = Integer.parseInt(tempVar4);
			}
		}
		if (m == 1)
		{
			System.out.printf("%d",a[n - m]);
		for (i = 0;i <= n - 2;i++)
		{
			System.out.printf(" %d",a[i]);
		}
			System.out.print("\n");
		}
		else if (m == n)
		{
			System.out.printf("%d",a[0]);
			for (t = 1;t <= n - 1;t++)
			{
				System.out.printf(" %d",a[t]);
			}
			System.out.print("\n");
		}
		else
		{
			System.out.printf("%d",a[n - m]);
			for (h = n - m + 1;h <= n - 1;h++)
			{
				System.out.printf(" %d",a[h]);
			}
			for (u = 0;u <= n - m - 1;u++)
			{
				System.out.printf(" %d",a[u]);
			}
		}
		System.out.print("\n");
	}


}

