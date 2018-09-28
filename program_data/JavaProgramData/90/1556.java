package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fang = new int(int x,int y);
		int i;
		int t;
		int m;
		int n;
		int f;
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",fang(m, n));
		}
	}
	public static int fang(int x,int y)
	{
		if (x == 1 || y == 1)
		{
		   return 1;
		}
		if (x > y)
		{
			return fang(x, y - 1) + fang(x - y, y);
		}
		if (x < y)
		{
			return fang(x, x);
		}
		if (x == y)
		{
		   return fang(x, y - 1) + 1;
		}

	}


}

