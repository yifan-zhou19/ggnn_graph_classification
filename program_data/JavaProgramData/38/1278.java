package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		int j;
		int i;
		double[][] x = new double[100][100];
		double s;
		double t;
		double h;
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
					x[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			t = 0;
			for (j = 0;j < n[i];j++)
			{
				t = t + x[i][j];
			}
			t = t / n[i];
			s = 0;
			for (j = 0;j < n[i];j++)
			{
				s = (x[i][j] - t) * (x[i][j] - t) + s;
			}
			h = Math.sqrt(s / n[i]);
			System.out.printf("%.5lf\n",h);

		}
		return 0;
	}
}

