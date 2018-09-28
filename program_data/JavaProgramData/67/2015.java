package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cases;
		double x;
		double y;
		double rate;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cases = Integer.parseInt(tempVar);
		}
		cases--;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Double.parseDouble(tempVar3);
		}
		rate = y / x;
		while (cases-- != 0)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				y = Double.parseDouble(tempVar5);
			}
			if (y / x - rate > 0.05)
			{
				System.out.print("better\n");
			}
			else if (rate - y / x > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
	}
}

