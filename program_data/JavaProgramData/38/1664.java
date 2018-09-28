package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double m;
		double[][] sz = new double[101][1003];
		double aver = 0;
		double s = 0;
		double x = 0;
		double y = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Double.parseDouble(tempVar2);
			}
			for (int j = 1;j <= m;j++)
			{
				sz[i][0] = m;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (int k = 0;k < n;k++)
		{
			for (int h = 1;h <= sz[k][0];h++)
			{
				x += sz[k][h];
			}
			aver = x / sz[k][0];
			x = 0;


			for (int b = 1;b <= sz[k][0];b++)
			{
				y += Math.pow(sz[k][b] - aver,2);
			}
			s = Math.sqrt(y / sz[k][0]);
			y = 0;
			System.out.printf("%.5lf\n",s);

		}

	return 0;
	}
}

