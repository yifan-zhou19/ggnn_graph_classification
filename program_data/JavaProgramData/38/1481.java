package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[][] b = new double[100][1000];
		int k;
		int[] n = new int[100];
		int i;
		int j;
		double[] t = new double[100];
		double[] u = new double[100];
		double[] a = new double[100];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				t[i] += b[i][j];
			}
			a[i] = t[i] / n[i];
			for (j = 0;j < n[i];j++)
			{
				u[i] += Math.pow((b[i][j] - a[i]),2);
			}
				s[i] = Math.sqrt(u[i] / n[i]);
				System.out.printf("%.5lf\n",s[i]);
		}
	}
}

