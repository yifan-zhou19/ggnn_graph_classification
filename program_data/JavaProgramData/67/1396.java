package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a;
		double b;
		double c;
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
		c = b / a;
		for (i = 0;i < n - 1;i++)
		{
			double j;
			double k;
			double l;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				j = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				k = Double.parseDouble(tempVar5);
			}
			l = k / j;
			if (c - l > 0.05)
			{
				System.out.print("worse\n");
			}
			if (c - l < -0.05.getValue() != 0)
			{
				System.out.print("better\n");
			}
			if (c - l < 0.05 && c - l>-0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

