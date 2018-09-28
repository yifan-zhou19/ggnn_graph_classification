package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		double x;
		double m;
		double p;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p = Double.parseDouble(tempVar3);
		}
		x = p / m;
		for (i = 0;i < n - 1;i++)
		{
			double a;
			double b;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b = Double.parseDouble(tempVar5);
			}
			double y;
			y = b / a;
			if (y - x > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x - y > 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((y - x <= 0.05) && (y - x >= -0.05))
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

