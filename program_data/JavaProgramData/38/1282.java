package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] k = new int[100];
		double[] a = new double[100];
		double[] s = new double[100];
		double[][] x = new double[100][100];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			s[i] = 0;
			for (j = 0;j < k[i];j++)
			{
				a[i] += x[i][j];
			}
			a[i] = a[i] / k[i];
			for (j = 0;j < k[i];j++)
			{
				s[i] += Math.pow((x[i][j] - a[i]),2);
			}
			s[i] = Math.sqrt(s[i] / k[i]);
			System.out.printf("%.5lf\n",s[i]);
		}
	}

}

