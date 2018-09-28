package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] x = new double[999];
		double[] y = new double[999];
		double[] s = new double[9999];
		double z = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		for (j = 1;j < n;j++)
		{
			for (i = j;i <= n;i++)
			{
				s[j + i - 1] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			 if (s[j + i - 1] > z)
			 {
				 z = s[j + i - 1];
			 }
			}
		}
		System.out.printf("%.4f\n",z);
		return 0;
	}




}

