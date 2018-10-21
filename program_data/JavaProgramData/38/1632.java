package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int j;
		double[] x = new double[1000];
		double sum;
		double p;
		double a;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			sum = 0;
			p = 0;
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
				sum += x[i];
			}
			a = (double)(sum / n);
			for (i = 0;i < n;i++)
			{
				p += (double)Math.pow((x[i] - a),2);
			}
			p = (double)(p / n);
			S = (double)Math.sqrt(p);
			System.out.printf("%.5f\n",S);
		}



		return 0;
	}
}

