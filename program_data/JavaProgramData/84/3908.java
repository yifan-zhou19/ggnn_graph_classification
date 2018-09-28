package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int u;
		int c;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		u = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > u)
			{
				u = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == u)
			{
			   a[i] = 0;
			}
		}
		c = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > c)
			{
				c = a[i];
			}
		}

		System.out.printf("%d\n%d\n",u,c);
		return 0;
	}

}

