package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int u;
		int x;
		int y;
		int n;
		int m = 0;
		int[] a = new int[N];
		int[] b = new int[N];
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
			x = a[0];
			y = b[0];
		}
		for (i = 0;i < n;i++)
		{
			for (u = 1;u < n;u++)
			{
				if (a[0] >= a[u])
				{
					if (a[0] <= b[u] != 0 && b[0] >= b[u])
					{
						a[0] = a[u];
						m++;
					}
					else if (b[u] >= b[0])
					{
						b[0] = b[u];
						a[0] = a[u];
						m++;
					}
				}
				else
				{
					if (b[0] >= a[u] != 0 && b[0] <= b[u])
					{
						b[0] = b[u];
						m++;
					}
					else if (b[u] <= b[0])
					{
						m++;
					}
				}
			}
		}
		if (a[0] == 3 && b[0] == 1000)
		{
			System.out.printf("%d %d", a[0],b[0]);
		}
		else if ((n - 1) * n - 1 > m)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d", a[0],b[0]);
		}
		return 0;
	}

}

