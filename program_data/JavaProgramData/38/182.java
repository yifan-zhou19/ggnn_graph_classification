package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		double[] a = new double[100];
		double x;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			s = 0;
			x = 0;
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
				x = x + a[j];
			}
			x = x / (double)n;
			for (j = 0;j < n;j++)
			{
				s = s + (a[j] - x) * (a[j] - x);
			}
			s = s / (double)n;
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}

}

