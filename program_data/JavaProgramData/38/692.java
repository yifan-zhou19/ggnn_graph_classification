package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			int j;
			double[] x = new double[1001];
			double a = 0;
			double s = 0;
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
					x[j] = Double.parseDouble(tempVar3);
				}
				a = a + x[j];
			}
			a = a / m;
			for (j = 0;j < m;j++)
			{
				s = s + (x[j] - a) * (x[j] - a);
			}
			s = Math.sqrt(s / m);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}

}

