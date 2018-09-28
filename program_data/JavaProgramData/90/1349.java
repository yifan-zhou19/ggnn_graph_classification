package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Q = new int(int x,int y);
		int[] a = new int[20];
		int[] b = new int[20];
		int[] c = new int[20];
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
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
			c[i] = Q(a[i], b[i]);

		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
	}
	public static int Q(int x,int y)
	{
		if (x == 1 || y == 1)
		{
			return 1;

		}
		else if (x < y)
		{
		return (1 + Q(x, x - 1));
		}
		else if (x == y)
		{
		return (1 + Q(x, y - 1));
		}
		else if (x > y)
		{
		return (Q(x, y - 1) + Q(x - y, y));
		}
	}

}

