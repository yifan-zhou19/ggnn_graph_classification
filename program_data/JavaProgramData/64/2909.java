package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h;
		double temp;
		double[] x = new double[30];
		double[][] y = new double[45][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(x[i]) = Double.parseDouble(tempVar2);
			}
		}
		h = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n - 1;j++)
			{
				y[h][0] = x[3 * i];
				y[h][1] = x[3 * i + 1];
				y[h][2] = x[3 * i + 2];
				h++;
			}
		}
		h = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				y[h][3] = x[3 * j];
				y[h][4] = x[3 * j + 1];
				y[h][5] = x[3 * j + 2];
				y[h][6] = Math.sqrt((y[h][0] - y[h][3]) * (y[h][0] - y[h][3]) + (y[h][1] - y[h][4]) * (y[h][1] - y[h][4]) + (y[h][2] - y[h][5]) * (y[h][2] - y[h][5]));
				h++;
			}
		}
		for (i = 0;i < (n * (n - 1) / 2) - 1;i++)
		{
		  for (j = 0;j < (n * (n - 1) / 2) - 1;j++)
		  {
			  if (y[j][6] < y[j + 1][6])
			  {
				  for (h = 0;h < 7;h++)
				  {
					  temp = y[j][h];
					  y[j][h] = y[j + 1][h];
					  y[j + 1][h] = temp;
				  }
			  }
		  }
		}
		for (i = 0;i < (n * (n - 1) / 2);i++)
		{
			System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",y[i][0],y[i][1],y[i][2],y[i][3],y[i][4],y[i][5],y[i][6]);
		}
		return 0;
	}
}

