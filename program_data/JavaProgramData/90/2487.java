package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int m;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int sort = new int(int,int);
		while (i <= t)
		{
			int k;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			k = sort(m, n);
			System.out.printf("%d\n",k);
			i++;
		}
	}
	public static int sort(int x,int y)
	{
		int z;
		if (y == 1)
		{
			return 1;
		}
		else
		{
			if (x >= y)
			{
				return (sort(x, y - 1) + sort(x - y, y));
			}
			else
			{
				return (sort(x, y - 1));
			}
		}
		return z;
	}
}

