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
		int i;
		int j;
		int k;
		double sum;
		double ave;
		double fc;
		double[] sz = new double[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			sum = 0;
			fc = 0;
			for (k = 0;k < j;k++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[k] = Double.parseDouble(tempVar3);
			}
			sum = sum + sz[k];
			}
			ave = (double)sum / j;
			for (k = 0;k < j;k++)
			{
				fc = fc + Math.pow(sz[k] - ave,2);
			}
			fc = (double)fc / j;
			fc = Math.sqrt(fc);
			System.out.printf("%.5lf\n",fc);



		}


		return 0;
	}
}

