package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double[] s = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= k;j++)
		{
			double b = 0;
			double a;
			double p = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				b += x[i];
			}
			a = (double)b / n;
			for (i = 0;i < n;i++)
			{
				p += (double)Math.pow((x[i] - a),2);
			}
			s[j] = (double)Math.sqrt(p / n);
		}
		for (j = 1;j <= k;j++)
		{
			System.out.printf("%.5lf\n",s[j]);
		}
		return 0;
	}


}

