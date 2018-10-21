package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[100][30];
		int i;
		int j;
		int k = 0;
		int m;
		int n;
		int p;
		double[] s = new double[1000];
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[k] = Math.sqrt((Math.pow(x[i][0] - x[j][0],2) + Math.pow(x[i][1] - x[j][1],2) + Math.pow(x[i][2] - x[j][2],2)) * 1.0);
				k++;
			}
		}
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (s[j] > s[j + 1])
				{
					a = s[j];
					s[j] = s[j + 1];
					s[j + 1] = a;
				}
			}
		}
		for (p = k - 1;p >= 0;p--)
		{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (s[p] != s[p + 1])
					{
						if (Math.sqrt((Math.pow(x[i][0] - x[j][0],2) + Math.pow(x[i][1] - x[j][1],2) + Math.pow(x[i][2] - x[j][2],2)) * 1.0) == s[p])
						{
							System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[i][0],x[i][1],x[i][2],x[j][0],x[j][1],x[j][2],s[p]);
						}
					}
				}
			}
		}
		return 0;
	}


}

