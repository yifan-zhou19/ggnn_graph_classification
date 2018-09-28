package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[][] x = new double[100][1000];
		double a;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			a = 0;
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
					x[i][j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				a = a + x[i][j];
			}
			a = a / n;
			for (j = 0;j < n;j++)
			{
				s[i] = s[i] + (x[i][j] - a) * (x[i][j] - a);
			}
			s[i] = s[i] / n;
			s[i] = Math.sqrt(s[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}

}

