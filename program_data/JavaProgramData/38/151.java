package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int k;
		int[] b = new int[100];
		double[][] a = new double[100][1000];
		double sum = 0;
		double s = 0;
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
				b[i] = Integer.parseInt(tempVar2);
			}

			for (j = 0;j < b[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Double.parseDouble(tempVar3);
				}
				sum += a[i][j];
			}
			sum = sum / b[i];
			for (j = 0;j < b[i];j++)
			{
				s += (a[i][j] - sum) * (a[i][j] - sum);
			}
			s /= b[i];
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);
			s = 0;
			sum = 0;
		}








		return 0;
	}


}

