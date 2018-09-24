package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double[] x = new double[5000];
		double[] y = new double[5000];
		double z;
		double[] w = new double[5000];
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
			z = y[0] / x[0];
			w[i] = y[i] / x[i];
		}
		for (i = 1;i < n;i++)
		{
			if ((w[i] - z) > 0.05)
			{
				System.out.print("better\n");
			}
			if ((z - w[i]) > 0.05)
			{
				System.out.print("worse\n");
			}
			if ((z - w[i]) <= 0.05 && (z - w[i]) >= (-0.05))
			{
				System.out.print("same\n");
			}
		}




		return 0;
	}


}

