package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int k;
			int[] n = new int[100];
			int i;
			int j;
		double[][] x = new double[100][100];
		double a = 0;
		double b;
		double c = 0;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
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
					x[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			a = 0;
			for (j = 0;j < n[i];j++)
			{
				a += x[i][j];
			}
			b = a / n[i];
			c = 0;
			for (j = 0;j < n[i];j++)
			{
				c += ((x[i][j] - b) * (x[i][j] - b));
			}
			d = Math.sqrt(c / n[i]);
			System.out.printf("%.5lf\n",d);
		}
		return 0;
	}
}

