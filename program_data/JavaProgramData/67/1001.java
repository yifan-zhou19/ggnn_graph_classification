package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b;
		int n;
		int d;
		int t = 0;
		double a;
		int[] z = new int[100];
		int[] x = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}


		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		a = 1.0 * b / d;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				x[i] = Integer.parseInt(tempVar5);
			}
		}
			for (i = 0;i < n - 1;i++)
			{
		if ((1.0 * x[i] / z[i]) - a > 0.05)
		{
				System.out.print("better\n");
		}
			else if (a - (1.0 * x[i] / z[i]) > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
			System.out.print("same\n");
			}
			}
		return 0;

	}
}

