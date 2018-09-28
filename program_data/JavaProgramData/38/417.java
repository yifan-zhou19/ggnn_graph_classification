package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double s;
		double b;
		double[] B = new double[100];
		double sum = 0;
		double[][] A = new double[100][100];
		int m;
		double a = 0;
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
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[i][j] = Double.parseDouble(tempVar3);
				}
			}
			b = 0;
			sum = 0;
			for (j = 0;j < m;j++)
			{
			 b += A[i][j];
			}
			a = b / m;
			for (j = 0;j < m;j++)
			{
			sum += Math.pow((A[i][j] - a),2);
			}
			B[i] = Math.sqrt(sum / m);
		}
		for (i = 0;i < n;i++)

		{
			s = B[i];
			System.out.printf("%.5lf\n", s);
		}
		return 0;
	}
}

