package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] x = new int[1000];
		int[] y = new int[1000];
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
		}
		a = 1.0 * y[0] / (1.0 * x[0]);
		for (i = 1;i < n;i++)
		{
			b = 1.0 * y[i] / (1.0 * x[i]);
			if (a - b > 0.05)
			{
				System.out.print("worse\n");
			}
			else if (b - a > 0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}



}

