package <missing>;

public class GlobalMembers
{
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		int fuc = new int(int a[5][5],int n,int m);
		if (fuc(a, n, m) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				int tmp;
				tmp = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = tmp;
			}
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				if (j < 4)
				{
				System.out.printf("%d ",a[i][j]);
				}
				else
				{
				System.out.printf("%d",a[i][4]);
				System.out.print("\n");
				}
			}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
	public static int fuc(int[][] a, int n, int m)
	{
		if (n <= 4 && m <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}

