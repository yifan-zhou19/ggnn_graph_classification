package <missing>;

public class GlobalMembers
{
	public static int swap(int n, int m, int[][] sz)
	{
		int t1;
		int t2;
		int t3;
		int t4;
		int t5;
		if (n <= 4 && n >= 0 && m >= 0 && m <= 4)
		{
			t1 = sz[n][0];
			t2 = sz[n][1];
			t3 = sz[n][2];
			t4 = sz[n][3];
			t5 = sz[n][4];
			sz[n][0] = sz[m][0];
			sz[n][1] = sz[m][1];
			sz[n][2] = sz[m][2];
			sz[n][3] = sz[m][3];
			sz[n][4] = sz[m][4];
			sz[m][0] = t1;
			sz[m][1] = t2;
			sz[m][2] = t3;
			sz[m][3] = t4;
			sz[m][4] = t5;
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int[][] sz = new int[5][5];
		int n;
		int m;
		int i;
		int p;
		int q;
		int j;
		int a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		a = swap(n, m, sz);

		if (a == 1)
		{
			for (q = 0;q < 5;q++)
			{
				for (p = 0;p < 4;p++)
				{
					System.out.printf("%d ",sz[q][p]);
				}
				if (p == 4)
				{
					System.out.printf("%d\n",sz[q][p]);
				}
			}
		}
		if (a == 0)
		{
			System.out.print("error");
		}
	}


}

