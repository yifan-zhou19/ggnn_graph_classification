package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int p = 0;
		double m;
		double[] b = new double[50];
		float[][] a = new float[10][2];
		int n;
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
				a[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[p] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				p = p + 1;
			}
		}
			m = b[0];
			for (i = 1;i < 50;i++)
			{
				if (b[i] > m)
				{
					m = b[i];
				}
			}
			System.out.printf("%.4f\n",m);

	}

}

