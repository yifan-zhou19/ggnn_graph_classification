package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		double[][] a = new double[100][100];
		double c = 0;
		double b = 0;
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
				n = Integer.parseInt(tempVar2);
			}
			c = 0;
			b = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Double.parseDouble(tempVar3);
				}
				c += a[i][j];
			}
			for (j = 0;j < n;j++)
			{
				b += (a[i][j] - c / n) * (a[i][j] - c / n);
			}
			System.out.printf("%.5lf\n",Math.sqrt(b / n));
		}
	}



}

