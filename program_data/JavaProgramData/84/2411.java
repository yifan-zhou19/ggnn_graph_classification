package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 1;
		int x = 0;
		int y = 0;

		for (i = 1;i <= n;i++)
		{
			int t;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				x = t;
			}
			else if (i == 2)
			{
				y = t;
			}

			if (x < y)
			{
				int z = x;
				x = y;
				y = z;
			}

			if (t > x)
			{
				y = x;
				x = t;
			}
			else if (t < x && t> y)
			{
			y = t;

			}

		}
		System.out.printf("%d\n%d\n",x,y);


		return 0;
	}
}

