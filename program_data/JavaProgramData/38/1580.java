package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double ave;
		double[][] num = new double[100][1000];
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			ave = 0;
			sum = 0;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Double.parseDouble(tempVar3);
				}
				sum = sum + num[i][j];
			}
			ave = (double)sum / m;
			sum = 0;
			for (j = 0;j < m;j++)
			{
				num[i][j] = num[i][j] - ave;
				num[i][j] = num[i][j] * num[i][j];
				sum = sum + num[i][j];
			}
			ave = (double)sum / m;
			ave = (double)Math.sqrt(ave);
			System.out.printf("%.5lf\n",ave);
		}
	}




}

