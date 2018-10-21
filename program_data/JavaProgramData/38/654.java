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
		int i;
		int[] n = new int[101];
		int j;
		double[] x = new double[1001];
		for (i = 0;i < k;i++)
		{
			double a = 0;
			double s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				a = a + x[j];
			}
			a = a / (double)n[i];
			for (j = 0;j < n[i];j++)
			{
				s = s + (x[j] - a) * (x[j] - a);
			}
			s = Math.sqrt(s / (double)n[i]);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

