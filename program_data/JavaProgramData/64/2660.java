package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		int i;
		int j;
		int[] x = new int[15];
		int[] y = new int[15];
		int[] z = new int[15];
		double[] s = new double[150];
		double k;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		t = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[t] = Math.sqrt((1.0) * ((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])));
				t++;
			}
		}
		for (i = 1;i <= t - 1;i++)
		{
			for (j = 0;j < t - i;j++)
			{
				if (s[j] < s[j + 1])
				{
					k = s[j];
					s[j] = s[j + 1];
					s[j + 1] = k;
				}
			}
		}
		for (m = 0;m < t;m++)
		{
			if (s[m] == s[m + 1])
			{
				continue;
			}
			else
			{
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (s[m] == Math.sqrt((1.0)(x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])))
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[i],y[i],z[i],x[j],y[j],z[j],s[m]);
					}
				}
			}
			}
		}
		return 0;
	}

}

