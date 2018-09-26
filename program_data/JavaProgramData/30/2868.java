package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int sum;
		int panduan = int;
		int jisuan = int;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 1;i <= n;i++)
		{
			x = panduan(i);
			if (x == 1)
			{
				sum = sum + jisuan(i);
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
	public static int panduan(int y)
	{
		int z;
		if (y % 7 == 0)
		{
			return 0;
		}
		else
		{
			for (; ;)
			{
				z = y - 10 * (int)(y / 10);
				if (z == 7)
				{
					return 0;
				}
				y = (int)(y / 10);
				if (y == 0)
				{
					return 1;
				}
			}
		}
	}
	public static int jisuan(int y)
	{
		int z;
		z = y * y;
		return (z);
	}
}

