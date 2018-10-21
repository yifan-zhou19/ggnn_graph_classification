package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int n;
			int j;
			double[] f = new double[1000];
			double a;
			double z = 0;
			double c = 0;
			double s2 = 0;
			double s;
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
					f[j] = Double.parseDouble(tempVar3);
				}
				z = z + f[j];
				c = c + 1;
			}
			a = z / c;
			for (j = 0;j < n;j++)
			{
				s2 = (f[j] - a) * (f[j] - a) + s2;
			}
			s = Math.sqrt(s2 / c);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

