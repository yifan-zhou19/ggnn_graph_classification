package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int x0;
		int y0;
		int result;
		int flag = 0;

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

		x0 = x;
		y0 = y;
		for (x = x0;x >= 1;x /= 2)
		{
			for (y = y0;y >= 1;y /= 2)
			{
				if (x == y && flag == 0)
				{
				   result = x;
				   flag = 1;
				}
			}
		}

		System.out.printf("%d\n",result);
		System.in.read();
		System.in.read();

		return 0;

	}

}

