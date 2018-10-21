package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int n;
		double[] a = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		   double sum = 0.00;
		   double aver = 0.00;
		   double y = 0.00;
		   double s = 0.00;
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
					a[j] = Double.parseDouble(tempVar3);
				}
				sum += a[j];
			}
				aver = sum / j;
				for (j = 0;j < n;j++)
				{
				y = y + (a[j] - aver) * (a[j] - aver);
				}
			s = Math.sqrt(y / n);
			System.out.printf("%.5lf\n",s);
		}
	}
}

