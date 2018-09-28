package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[5][5];
		int i;
		int j;
		int t;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar);
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
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = t;
			}
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[0][j]);
			}
			System.out.printf("%d\n",a[0][4]);
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[1][j]);
			}
			System.out.printf("%d\n",a[1][4]);
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[2][j]);
			}
			System.out.printf("%d\n",a[2][4]);
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[3][j]);
			}
			System.out.printf("%d\n",a[3][4]);
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[4][j]);
			}
			System.out.printf("%d\n",a[4][4]);
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

