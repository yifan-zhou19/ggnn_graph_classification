package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double t;
		double[][] a = new double[100][2];
		double[] dd = new double[100];
		int n;
		int i;
		int j;
		int cnt = 0;
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
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i < j)
				{
					cnt++;
				}
				dd[cnt] = Math.pow(a[i][0] - a[j][0],2) + Math.pow(a[i][1] - a[j][1],2);
			}
		}
			for (i = 0;i < cnt - 1;i++)
			{
				for (j = 0;j < cnt - 1 - i;j++)
				{
				if (dd[j] < dd[j + 1])
				{
					t = dd[j];
					dd[j] = dd[j + 1];
					dd[j + 1] = t;
				}
				}
			}
				System.out.printf("%.4lf",Math.sqrt(dd[0]));
				return 0;

	}
}

