package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 2)
		{
			return 0;
		}
		double[][] a = new double[100][2];
		{
		  for (i = 0;i < n;i++)
		  {
			  for (j = 0;j < 2;j++)
			  {
				  a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			  }
		  }

		}
		int k;
		double m;
		double temp;
		double dis;
		dis = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				m = (a[i][0] - a[k][0]) * (a[i][0] - a[k][0]) + (a[i][1] - a[k][1]) * (a[i][1] - a[k][1]);
				temp = Math.sqrt(m);
				if (dis < temp)
				{
				dis = temp;
				}
			}
		}
		System.out.printf("%.4f\n",dis);
		return 0;
	}


}

