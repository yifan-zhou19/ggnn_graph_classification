package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int c;
		if (m >= n)
		{
			if (n == 1 || m == 1)
			{
			c = 1;
			}
			else if (m == 2 && n != 1)
			{
				c = 2;
			}
			else if (m == 0)
			{
			c = 1;
			}
			else
			{
			c = f(m - n, n) + f(m, n - 1);
			}
			return c;
		}
		else
		{
			c = f(m, m);
			return c;
		}
	}
	public static int Main()
	{
		int f = new int(int,int);
		int x;
		int y;
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(x, y));
		}
		return 0;
	}
}

