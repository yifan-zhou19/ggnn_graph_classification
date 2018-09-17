package <missing>;

public class GlobalMembers
{
	public static int luo(int x,int y)
	{
		int r1;
		int r2;
		int c;
		if (x == y)
		{
			return x;
		}
		else
		{
			r1 = Math.log((double)x) / (Math.log(2.0));
			r2 = Math.log((double)y) / (Math.log(2.0));
			if (r1 >= r2)
			{
				x = x / 2;
				luo(x, y);
			}
			else
			{
				y = y / 2;
				luo(x, y);
			}
		}
	}
	public static int Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",luo(x, y));

		return 0;
	}
}

