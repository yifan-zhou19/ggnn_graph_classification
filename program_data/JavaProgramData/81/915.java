package <missing>;

public class GlobalMembers
{
		public static int n;
		public static int m;
		public static int i;
		public static int j;
		public static int k;
		public static int q;
		public static int p;
		public static int w = 0;
		public static int[][] c = new int[5][5];

		public static int change(int a,int b)
		{
		int e;
		if ((a <= 4) && (b <= 4))
		{
			for (i = 0;i < 5;i++)
			{
				e = c[n][i];
				c[n][i] = c[m][i];
				c[m][i] = e;
			}
			return 1;
		}
		else
		{
			return 0;
		}
		}
	public static void Main()
	{

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					c[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		k = change(n, m);
		if (k == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (q = 0;q < 5;q++)
			{
				for (p = 0;p < 5;p++)
				{
					if (p == 0)
					{
						System.out.printf("%d",c[q][p]);
					}
					else
					{
						System.out.printf(" %d",c[q][p]);
					}

				}
				System.out.print("\n");
			}
		}



	}
}

