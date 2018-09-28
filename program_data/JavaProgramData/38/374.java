package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			int n;
			double[] a = new double[100];
			double sum = 0;
			double x;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
					 sum = sum + a[j];
			}
			x = sum / n;
			double s1 = 0;
			double s2;
			for (int j = 0;j < n;j++)
			{

				s1 = s1 + (a[j] - x) * (a[j] - x);
			}
			s2 = Math.sqrt(s1 / n);
			System.out.printf("%.5lf\n",s2);
		}
		 return 0;
	}

}

