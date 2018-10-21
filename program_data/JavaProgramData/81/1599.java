package <missing>;

public class GlobalMembers
{
	public static int F(int[][] a, int n, int m)
	{
		int i;
		int j;
		int tem;
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				tem = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = tem;
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
			}
			return 1;
		}
		else
		{
			System.out.print("error");
			return 0;
		}
	}

	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		F(a, n, m);
		return 0;
	}

}

