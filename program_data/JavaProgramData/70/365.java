package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		float[] x = new float[100];
		float[] y = new float[100];
		double max = 0.0;
		double z;
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
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < j;i++)
			{
			z = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			if (z > max)
			{
				max = z;
			}
			}
		}
		System.out.printf("%.4f\n", max);
	}

}

