package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int i;
		int t;
		double[] a = new double[100];
		double ave = 0.00;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (t = 0;t < k;t++)
		{
			ave = 0.00;
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
					a[i] = Double.parseDouble(tempVar3);
				}
				ave = ave + a[i];
			}
			ave = ave / n;
			//printf("%lf",ave);
			s = 0.00;
			for (i = 0;i < n;i++)
			{
				s = s + (a[i] - ave) * (a[i] - ave);
			}
			s = s / n;
		//	printf("%lf",s);
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}
	}
}

