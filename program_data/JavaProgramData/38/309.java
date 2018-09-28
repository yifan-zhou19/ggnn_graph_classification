package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[1200];
		double sum;
		double s;
		double b;
			int n;
			int m;
			int i;
			int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = 0;
			b = 0;
			s = 0;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + a[j];
			}
			b = sum / m;
			for (j = 0;j < m;j++)
			{
				a[j] = (a[j] - b) * (a[j] - b);
				s = s + a[j];
			}
				s = s / m;
				s = Math.sqrt(s);

			System.out.printf("%.5lf\n",s);
		}









			return 0;
	}


}

