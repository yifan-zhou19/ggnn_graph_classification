package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		c = 1.000000000 * b / a;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			if ((1.000000000 * b / a - c) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((1.000000000 * b / a - c) < -0.05)
			{
				System.out.print("worse\n");
			}
			else if ((1.000000000 * b / a - c) > -0.05 && (1.000000000 * b / a - c) < 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

