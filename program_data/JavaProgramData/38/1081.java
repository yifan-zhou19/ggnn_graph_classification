package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
			double[] x = new double[100];
			double sum = 0;
			double sum2 = 0;
			double aver = 0;
			double aver2 = 0;
			double[] s = new double[100];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				k = Integer.parseInt(tempVar);
			}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[0] = Double.parseDouble(tempVar3);
			}
			for (i = 1;i < n;i++)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					x[i] = Double.parseDouble(tempVar4);
				}
			}
				for (i = 0;i < n;i++)
				{
					sum = sum + x[i];
				}
				aver = sum / n;
					for (i = 0;i < n;i++)
					{
						sum2 = (x[i] - aver) * (x[i] - aver) + sum2;
					}
					aver2 = sum2 / n;
				s[j] = Math.sqrt(aver2);
						sum = 0;
						sum2 = 0;
						aver = 0;
						aver2 = 0;
		}
			for (j = 0;j < k;j++)
			{
						System.out.printf("%.5lf\n",s[j]);
			}


	}


}

