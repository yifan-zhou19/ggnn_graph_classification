package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double std;
		double a;
		double b;
		double x;
		double y;
		double[] sz = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
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
		std = b / a;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				y = Double.parseDouble(tempVar5);
			}
			if (((y / x) - std) > 0.05)
			{
				sz[i] = 1;
			}
			else if ((std - (y / x)) > 0.05)
			{
				sz[i] = 0;
			}
			else
			{
				sz[i] = 2;
			}
		}
		for (i = 1;i < n;i++)
		{
			if (sz[i] == 1)
			{
				System.out.print("better\n");
			}
			else if (sz[i] == 0)
			{
				System.out.print("worse\n");
			}
			else if (sz[i] == 2)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

