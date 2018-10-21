package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		double[] b = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < k;i++)
		{
			double sum = 0;
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			int j;
			for (j = 0;j < a;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + b[j];
			}
			double c = 0;
			for (j = 0;j < a;j++)
			{
				c = c + (b[j] - sum / a) * (b[j] - sum / a);
			}
			double s = 0;
			s = Math.sqrt(c / a);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

