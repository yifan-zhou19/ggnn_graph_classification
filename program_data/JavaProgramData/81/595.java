package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static void Main()
	{
		void zz(int m,int n);
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
			{
			zz(m, n);
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d",a[i][j]);
				if (j < 4)
				{
					System.out.print(" ");
				}
			}
			if (i < 4)
			{
				System.out.print("\n");
			}
			}
			}
			else
			{
				System.out.print("error");
			}
	}
	public static void zz(int m,int n)
	{
		int i;
		int j;
		int t;
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
				for (i = 0;i < 5;i++)
				{
					t = a[m][i];
					a[m][i] = a[n][i];
					a[n][i] = t;
				}
		}
	}
}

