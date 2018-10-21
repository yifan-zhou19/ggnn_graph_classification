package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		double a;
		double b;
		double c;
		double t;
		double summ = 0;
		int[] count = new int[100];
		double[] sum = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[][] x = new double[100][100];
		double[] result = new double[100];
		int[] number = new int[100];
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
			number[i] = m;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				sum[i] = sum[i] + x[i][j];
				count[i] = count[i] + 1;
			}
		}
		for (i = 0;i < n;i++)
		{

			summ = 0;
			a = (double)sum[i] / count[i];

			for (j = 0;j < number[i];j++)
			{
				b = x[i][j] - a;
				c = Math.pow(b,2);
				summ = summ + c;
			}
			t = (double)summ / count[i];
			result[i] = Math.sqrt(t);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",result[i]);
		}

	}

}

