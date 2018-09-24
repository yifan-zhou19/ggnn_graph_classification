package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[100];
		int[] y = new int[100];
		int i;
		double[] z = new double[100];
		double k;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			z[i] = 1.0 * y[i] / x[i];
		}
		for (i = 1;i < n;i++)
		{
			k = z[i] - z[0];
			if (k > 0.05)
			{
				System.out.print("better\n");
			}
			if (k < 0.05 && k>-0.05)
			{
				System.out.print("same\n");
			}
			if (k < -0.05)
			{
				System.out.print("worse\n");
			}
		}
		return 0;
	}
}

