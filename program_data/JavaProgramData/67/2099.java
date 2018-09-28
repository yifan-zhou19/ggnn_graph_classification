package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] sz1 = new double[100];
		double[] sz2 = new double[100];
		double[] y = new double[100];
		double t;
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
				sz1[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz2[i] = Double.parseDouble(tempVar3);
			}
			t = sz2[0] / sz1[0];
		}
		for (i = 1;i < n;i++)
		{
			y[i] = sz2[i] / sz1[i];
			if ((y[i] - t) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((t - y[i]) > 0.05)
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

