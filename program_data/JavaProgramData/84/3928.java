package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int x;
		int y;
		int m = 0;
		int i;
		int j;
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
		}
		x = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > x)
			{
				x = a[i];
				m = i;
			}
		}
		if (m == 0)
		{
			y = a[1];
			for (i = 2;i < n;i++)
			{
				if (a[i] > y)
				{
					y = a[i];
				}
			}
		}
		else
		{
			y = a[0];
			for (i = 1;i < n;i++)
			{
				if (i == m)
				{
					continue;
				}
				else
				{
					if (a[i] > y)
					{
						y = a[i];
					}
				}
			}
		}
		System.out.printf("%d\n%d",x,y);
		return 0;
	}

}

