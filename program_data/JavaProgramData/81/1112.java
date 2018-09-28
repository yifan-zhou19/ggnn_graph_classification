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
		int t;
		int flag;
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
			flag = 1;
		}
		else
		{
			flag = 0;
		}
		if (flag == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				t = a[m][j];
				a[m][j] = a[n][j];
				a[n][j] = t;
			}
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				if (i == 4 && j == 4)
				{
					System.out.printf("%d",a[4][4]);
				}
				else
				{
					if (j == 4)
					{
						System.out.printf("%d\n",a[i][j]);
					}
					else
					{
						System.out.printf("%d ",a[i][j]);
					}
				}
			}
			}
		}
		return 0;
	}

}

