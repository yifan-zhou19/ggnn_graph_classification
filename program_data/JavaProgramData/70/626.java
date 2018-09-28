package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] A = new double[100][2];
		double s;
		double max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					A[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{

			for (j = i + 1;j < n;j++)
			{
				s = Math.sqrt(Math.pow(A[i][0] - A[j][0],2) + Math.pow(A[i][1] - A[j][1],2));
				if (s > max)
				{
					max = s;
				}
			}
		}

		System.out.printf("%.4lf",max);
		return 0;
	}
}

