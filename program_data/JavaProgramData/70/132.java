package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int m;
		int j;
		double x;
		double y;
		double c;
		double max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] p = new double[9999][2];
		for (i = 0;i < n;i++)
		{
			for (m = 0;m < 2;m++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][m] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (j != i)
				{
					x = p[i][1] - p[j][1];
					y = p[i][0] - p[j][0];
					c = Math.sqrt(x * x + y * y);
					if (c > max)
					{
						max = c;
					}
				}
			}
		}
		System.out.printf("%.4lf",max);
	}


}

