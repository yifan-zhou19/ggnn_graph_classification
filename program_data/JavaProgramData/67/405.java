package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double jsum;
		double jyx;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jsum = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			jyx = Double.parseDouble(tempVar3);
		}
		double x = jyx / jsum;
		int i;
		double[] sum = new double[100];
		double[] yx = new double[100];
		double[] y = new double[100];
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sum[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				yx[i] = Double.parseDouble(tempVar5);
			}
			y[i] = yx[i] / sum[i];
			if ((y[i] - x) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((x - y[i]) > 0.05)
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

