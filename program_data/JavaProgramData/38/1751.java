package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double[] l = new double[1000];
		double[] k = new double[100];
		double s = 0;
		double h = 0;
		double a;
		double b;
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
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					l[j] = Double.parseDouble(tempVar3);
				}
				s = s + l[j];
			}
			a = (double)(s / m);
			for (j = 0;j < m;j++)
			{
				h = h + (l[j] - a) * (l[j] - a);
			}
			b = (double)(h / m);
			k[i] = Math.sqrt(b);
			s = 0;
			h = 0;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",k[i]);
		}
		return 0;
	}
}

