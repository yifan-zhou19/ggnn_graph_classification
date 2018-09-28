package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int e;
		int x = 0;
		int y = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (x < y)
			{
				e = y;
				y = x;
				x = e;
			}
			if (a > x)
			{
				y = x;
				x = a;

			}
			if (a < x && a> y)
			{
				y = a;
			}
		}
		System.out.printf("%d\n",x);
		System.out.printf("%d\n",y);
		return 0;
	}

}

