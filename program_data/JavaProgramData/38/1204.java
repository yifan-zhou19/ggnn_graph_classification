package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[101];
		int i;
		int j;
		double[] x = new double[1001];
		double[] s = new double[101];
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			double b = 0;
			double sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + x[j];
			}
			a = sum / m[i];
			for (j = 0;j < m[i];j++)
			{
				b = b + (x[j] - a) * (x[j] - a);
			}
			s[i] = Math.sqrt(b / m[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}


}

