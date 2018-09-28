package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x = 0;
		int y = 0;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		int k = 0;
		while (scanf(",%d", z))
		{
			k++;
			if (z > x)
			{
				y = x;
				x = z;
			}
			if (z < x && z> y)
			{
				y = z;
			}
		}
		if (k == 0 || y == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",y);
		}
		return 0;
	}
}

