package <missing>;

public class GlobalMembers
{
	public static int devide(int x,int y)
	{
		if (y == 1)
		{
			return 1;
		}

		else if (x == 1)
		{
			return 1;
		}
		else if (x < y)
		{
			return devide(x, x);
		}
		else if (x > y)
		{
			return devide(x, y - 1) + devide(x - y, y);
		}
		else if (x == y)
		{
			return devide(x, y - 1) + 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int x;
		int y;
		int out;
		for (i = 0;i <= n - 1;i++)
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
			out = devide(x, y);
			System.out.printf("%d\n",out);
		}
	}

}

