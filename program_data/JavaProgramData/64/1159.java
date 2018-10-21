package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c;
		int d;
		int[][] s = new int[10][3];
		int k;
		int f;
		double[][] a = new double[10][10];
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				a[i][j] = Math.sqrt(Math.pow(s[i][0] - s[j][0],2) + Math.pow(s[i][2] - s[j][2],2) + Math.pow(s[i][1] - s[j][1],2));
			}
		}
		e = 0;
		f = (n * n - n) / 2;
		for (k = 1;k <= f;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (e < a[i][j])
					{
						e = a[i][j];
						c = i;
						d = j;
					}
				}
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",s[c][0],s[c][1],s[c][2],s[d][0],s[d][1],s[d][2],e);
			e = 0;
			a[c][d] = 0;
			c = 0;
			d = 0;

		}
		return 0;
	}

}

