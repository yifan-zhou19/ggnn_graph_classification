package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x,int y);
		int t;
		int[] m = new int[25];
		int[] n = new int[25];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n", f(m[i], n[i]));
		}
		return 0;
	}
	public static int f(int x,int y)
	{
		if (y == 1)
		{
			return (1);
		}
		else
		{
			int empty;
			int full;
			if (x < y)
			{
				full = 0;
			}
			if (x == y)
			{
				full = 1;
			}
			if (x > y)
			{
				full = f(x - y, y);
			}
			empty = f(x, y - 1);
			return (empty + full);
		}
	}


}

