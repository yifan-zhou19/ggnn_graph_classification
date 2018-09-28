package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double z;
		double y;
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Double.parseDouble(tempVar3);
		}
		a = y / z;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				y = Double.parseDouble(tempVar5);
			}
			b = y / z;
			if (b - a > 0.05)
			{
				System.out.print("better\n");
			}
			if (b - a <= 0.05 && b - a >= -0.05)
			{
				System.out.print("same\n");
			}
			if (b - a < -0.05.getValue() != 0)
			{
				System.out.print("worse\n");
			}
		}
		return 0;
	}

}

