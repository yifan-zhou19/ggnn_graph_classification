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
		int[] n = new int[1000];
		double[][] x = new double[1000][1000];
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(n[i]) = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(x[i][j]) = Double.parseDouble(tempVar3);
				}
			}
		}
		double[] s = new double[1000];
		double a;
		double b;
		for (i = 0;i < k;i++)
		{
			a = 0;
			b = 0;
			for (j = 0;j < n[i];j++)
			{
				a = a + x[i][j];
			}
			for (j = 0;j < n[i];j++)
			{
				b = b + (x[i][j] - a / n[i]) * (x[i][j] - a / n[i]);
			}
			s[i] = Math.sqrt(b / n[i]);
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}

}

