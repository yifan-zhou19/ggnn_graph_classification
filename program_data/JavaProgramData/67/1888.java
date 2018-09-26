package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int a;
		double p;
		double x;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			e = Integer.parseInt(tempVar3);
		}
		p = 1.0 * e / a;
		for (int i = 1;i <= n - 1;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		x = 1.0 * e / a;
		if ((x - p) * (x - p) <= 0.0025)
		{
			System.out.print("same\n");
		}
		if ((x - p) > 0.05)
		{
			System.out.print("better\n");
		}
		if ((x - p) < -0.05)
		{
			System.out.print("worse\n");
		}
		}
		return 0;
	}

}

