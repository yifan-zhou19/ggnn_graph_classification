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

		double a1;
		double b1;
		double c1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a1 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b1 = Double.parseDouble(tempVar3);
		}
		c1 = (b1 / a1) * (double)100;

		int i;
		double[] a2 = new double[100];
		double[] b2 = new double[100];
		double[] c2 = new double[100];
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a2[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b2[i] = Double.parseDouble(tempVar5);
			}
			c2[i] = (b2[i] / a2[i]) * (double)100;
			if (c2[i] - c1 > 5)
			{
				System.out.print("better\n");
			}
			if (c1 - c2[i] > 5)
			{
				System.out.print("worse\n");
			}
			if (c2[i] - c1 <= 5 && c1 - c2[i] <= 5)
			{
				System.out.print("same\n");
			}
		}

		return 0;
	}


}

