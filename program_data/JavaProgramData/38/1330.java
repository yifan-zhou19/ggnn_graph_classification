package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int j;
		double[] x = new double[100];
		double a = 0;
		double s = 0;
		double sum = 0;
		double upper = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			sum = 0,upper = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + x[j];
			}
			a = sum / n;
			for (j = 1;j <= n;j++)
			{
				upper = upper + Math.pow((x[j] - a),2);
			}
			s = Math.sqrt(upper / n);
			System.out.printf("%.5lf\n",s);

		}


		return 0;
	}

}

