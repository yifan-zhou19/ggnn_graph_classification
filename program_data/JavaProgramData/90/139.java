package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int,int);
		int m;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t > 0)
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
			System.out.printf("%d\n",f(m, n));
			t--;
		}
	}
	public static int f(int x,int y)
	{
		if (x == 0 || y == 1)
		{
			return 1;
		}
		if (x < y)
		{
			return f(x, x);
		}
		return f(x - y, y) + f(x, y - 1);
	}
}

