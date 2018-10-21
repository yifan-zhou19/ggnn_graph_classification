package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] z = new double[1000];
		double[] y = new double[1000];
		double a;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		a = y[1] / z[1];
		for (int b = 2;b <= n;b++)
		{
			p = y[b] / z[b];
			if (p - a > 0.05)
			{
				System.out.print("better\n");
			}
			else if (a - p > 0.05)
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

