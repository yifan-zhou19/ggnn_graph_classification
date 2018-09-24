package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[100][100];
		int i;
		int k;
		int j;
		int[] s = new int[100];
		int t;
		int p;
		int m;
		int[] l = new int[100];
		double a;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i][0] = Integer.parseInt(tempVar);
			}
			if (n[i][0] == -1)
			{
				break;
			}
			else
			{
				for (j = 1;j < 100;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						n[i][j] = Integer.parseInt(tempVar2);
					}
					if (n[i][j] == 0)
					{
						break;
					}
					l[i] = j;

				}
			}

		}



		for (k = 0;k < i;k++)
		{
			s[k] = 0;
			for (t = 0;t <= l[k];t++)
			{
				for (m = t;m <= l[k];m++)
				{
					a = (double)n[k][t] / n[k][m];
					if (a == 2 || a == 0.5)
					{
						s[k] = s[k] + 1;
					}
				}
			}
		}
		for (p = 0;p < i;p++)
		{
			System.out.printf("%d\n",s[p]);
		}
		return 0;
	}
}

