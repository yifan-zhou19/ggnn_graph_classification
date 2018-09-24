package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int[] n = new int[100];
		int j;
		double sum = 0;
		double[] x = new double[1000];
		double sum1;
		double sum2 = 0;
		double ave = 0;
			double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
			ave = 0;
			sum2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + x[j];
			}
				ave = sum / n[i];
				for (j = 0;j < n[i];j++)
				{
					sum2 = (double)(sum2 + Math.pow(x[j] - ave,2));
					sum1 = (double)(sum2 / n[i]);
					s = Math.sqrt(sum1);
				}

				System.out.printf("%.5lf\n",s);
		}

		return 0;
	}


}

