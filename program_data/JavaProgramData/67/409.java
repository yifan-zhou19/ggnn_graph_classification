package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double[] j = new double[500];
		double[][] a = new double[500][2];
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
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		j[0] = 100 * a[0][1] / a[0][0] * 1.0;
		for (i = 1;i < n;i++)
		{
			j[i] = 100 * a[i][1] / a[i][0] * 1.0;
		}
		for (i = 1;i < n;i++)
		{
			if (j[i] - j[0] > 5)
			{
				System.out.print("better\n");
			}
			if (j[0] - j[i] > 5)
			{
				System.out.print("worse\n");
			}
			if ((j[i] - j[0] <= 5) && (j[0] - j[i] <= 5))
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

