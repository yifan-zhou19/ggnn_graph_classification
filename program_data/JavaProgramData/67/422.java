package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double a;
		double b;
		double c;
		double d;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Double.parseDouble(tempVar3);
		}
		m = b / a;
		while (n > 1)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d = Double.parseDouble(tempVar5);
			}
			a = m - d / c;
			if (a > 0.05)
			{
				System.out.print("worse\n");
			}
			if (a < -0.05)
			{
				System.out.print("better\n");
			}
			if (a <= 0.05 && a >= -0.05)
			{
				System.out.print("same\n");
			}
			n = n - 1;
		}
		return 0;
	}
}

