package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int apple = new int(int x,int y);
		int i;
		int t;
		int m;
		int n;
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
			System.out.printf("%d\n",apple(m, n));
		}
		return 0;
	}
	public static int apple(int x,int y)
	{
		int p = 0;
		if (y == 1)
		{
			p = 1;
		}
		else if (x > y)
		{
			p = apple(x, y - 1) + apple(x - y, y);
		}
		else if (x == y)
		{
			p = apple(x, y - 1) + 1;
		}
		else
		{
			p = apple(x, y - 1);
		}
		return (p);
	}
}

