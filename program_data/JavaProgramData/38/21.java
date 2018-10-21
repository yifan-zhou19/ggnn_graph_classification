package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double b = 0.0;
		double a = 0.0;
		double[] x = new double[1000];
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				a += x[j];
			}
			for (j = 0;j < n;j++)
			{
				b += Math.pow((x[j] - a / n),2);
			}
			s = Math.sqrt(b / n);
			System.out.printf("%.5lf\n",s);
			a = 0;
			b = 0;
		}
		return 0;
	}



}

