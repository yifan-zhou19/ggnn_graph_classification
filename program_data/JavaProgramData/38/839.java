package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		double p = 0.0;
		double pa = 0.0;
		double a = 0.0;
		double sum2 = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < k;j++)
		{
			int n = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] num = new double[1000];
			double sum = 0.0;
			for (int i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i] = Double.parseDouble(tempVar3);
				}
				sum += num[i];

			}
			a = sum / n;
					   sum2 = 0;
			for (int m = 0;m < n;m++)
			{
				sum2 += (num[m] - a) * (num[m] - a);
			}
				p = Math.sqrt((sum2) / n);
				 System.out.printf("%.5f\n",p);

		}
		return 0;
	}

}

