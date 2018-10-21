package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		double[] x = new double[100];
		double[] y = new double[100];
		double max;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[0] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x[1] = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y[1] = Double.parseDouble(tempVar5);
		}
		max = Math.pow(x[0] - x[1],2.0) + Math.pow(y[0] - y[1],2.0);
		for (i = 2;i < n;i++)
		{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				x[i] = Double.parseDouble(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				y[i] = Double.parseDouble(tempVar7);
			}
			for (j = 0;j < i;j++)
			{
				if ((t = Math.pow(x[i] - x[j],2.0) + Math.pow(y[i] - y[j],2.0)) > max)
				{
					max = t;
				}
			}
		}
		System.out.printf("%.4f\n",Math.sqrt(max));
	}
}

