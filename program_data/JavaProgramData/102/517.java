package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] ren = new char[40][7];
		double[] sg = new double[40];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ren[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sg[i] = Double.parseDouble(tempVar3);
			}
		}
		double[] nssg = new double[40];
		double[] vssg = new double[40];
		double e;
		int m;
		int t;
		m = 0;
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (ren[i][0] == 'm')
			{
				nssg[m] = sg[i];
				m++;
			}
			else
			{
				vssg[t] = sg[i];
				t++;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (nssg[j] > nssg[j + 1])
				{
					e = nssg[j + 1];
					nssg[j + 1] = nssg[j];
					nssg[j] = e;
				}
			}
		}
		for (i = 1;i <= t;i++)
		{
			for (j = 0;j < t - i;j++)
			{
				if (vssg[j] > vssg[j + 1])
				{
					e = vssg[j + 1];
					vssg[j + 1] = vssg[j];
					vssg[j] = e;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",nssg[i]);
		}
		for (i = t - 1;i > 0;i--)
		{
			System.out.printf("%.2lf ",vssg[i]);
		}
		System.out.printf("%.2lf\n",vssg[0]);
		return 0;
	}

}

