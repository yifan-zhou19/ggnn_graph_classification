package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static int n;
	public static int max(int p,int q)
	{
		if (p >= q)
		{
			return p;
		}
		else
		{
			return q;
		}
	}
	public static int shot(int x,int y)
	{
		if (x == n)
		{
			if (a[x] <= y)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if (a[x] > y)
			{
				return (shot(x + 1, y));
			}
			else
			{
				return (max(shot(x + 1, y), shot(x + 1, a[x]) + 1));
			}
		}
	}
	public static int Main()
	{
		int i;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		m = shot(1, 9999);
		System.out.printf("%d",m);
		return 0;
	}



}

