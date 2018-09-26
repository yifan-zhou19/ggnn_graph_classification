package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int m;
		int g;
		int hh;
		int[] a = new int[60];
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
				m = Integer.parseInt(tempVar2);
			}
			for (t = 0;t < m;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[t] = Integer.parseInt(tempVar3);
				}
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else if (m == 1)
			{
				if (a[0] >= 60)
				{
					g = 60;
				}
				else if (a[0] <= 57)
				{
					g = 57;
				}
				else
				{
					g = a[0];
				}
				System.out.printf("%d\n",g);
			}
			else
			{
			for (t = 0;t < m;t++)
			{
				if (a[t] + 3 * t <= 60)
				{
				hh = t;
				}
			}
			if (a[hh] + 3 * hh <= 57)
			{
				g = 57 - 3 * hh;
			}
			else
			{
				g = a[hh];
			}
			System.out.printf("%d\n",g);
			}
		}
		return 0;
	}
}

