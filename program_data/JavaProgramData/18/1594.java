package <missing>;

public class GlobalMembers
{
	public static int[][] JU = new int[100][100];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h;
		int l;
		int M;
		void JUbian(int N,int JU[100][100]);
		void JUxiao(int N,int JU[100][100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			M = 0;
			for (h = 0;h < n;h++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						JU[h][l] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (j = n;j > 1;j--)
			{
				JUbian(j, JU);
				M = M + JU[1][1];
				JUxiao(j, JU);
			}
			System.out.printf("%d\n",M);
		}
		return 0;
	}

	public static void JUbian(int n, int[][] JU)
	{
		int h;
		int l;
		int min;
		for (h = 0;h < n;h++)
		{
			min = JU[h][0];
			for (l = 1;l < n;l++)
			{
				if (JU[h][l] < min)
				{
					min = JU[h][l];
				}
			}
			for (l = 0;l < n;l++)
			{
				JU[h][l] = JU[h][l] - min;
			}
		}
		for (l = 0;l < n;l++)
		{
			min = JU[0][l];
			for (h = 1;h < n;h++)
			{
				if (JU[h][l] < min)
				{
					min = JU[h][l];
				}
			}
			for (h = 0;h < n;h++)
			{
				JU[h][l] = JU[h][l] - min;
			}
		}
	}


	public static void JUxiao(int n, int[][] JU)
	{
		int h;
		int l;
		for (h = 0;h < n - 1;h++)
		{
			for (l = 0;l < n;l++)
			{
				if (h > 0)
				{
					JU[h][l] = JU[h + 1][l];
				}
			}
		}
		for (l = 0;l < n - 1;l++)
		{
			for (h = 0;h < n - 1;h++)
			{
				if (l > 0)
				{
					JU[h][l] = JU[h][l + 1];
				}
			}
		}
	}

}

