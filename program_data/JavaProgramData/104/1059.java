package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int xunzhao = new int(int x,int y);
		int x;
		int y;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		q = xunzhao(x, y);
		System.out.printf("%d",q);

	}
	public static int xunzhao(int x,int y)
	{
		int q;
		if (x == y)
		{
		q = x;
		}
		if (x > y)
		{
		return xunzhao(x / 2, y);
		}
		if (x < y)
		{
		return xunzhao(x, y / 2);
		}
		return q;
	}
}

