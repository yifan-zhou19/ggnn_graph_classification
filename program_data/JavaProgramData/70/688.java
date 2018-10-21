package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double len;
		double lenmax;
		double[] x = new double[100];
		double[] y = new double[100];
		int i;
		int j;
		int n;
		lenmax = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
			   len = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
			   if (len > lenmax)
			   {
				  lenmax = len;
			   }

			}
		}

		 System.out.printf("%.4lf\n", lenmax);
	}
}

