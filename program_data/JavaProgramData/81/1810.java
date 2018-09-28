package <missing>;

public class GlobalMembers
{
	public static int change(int n,int m)
	{
		int s = 0;
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{
			s = 1;
		}
		return s;
	}


	public static void Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int n;
		int m;
		int temp;
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
		if (change(n, m) == 1)
		{
			for (j = 0;j < 5;j++)
			{
				temp = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = temp;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j != 4)
					{
					System.out.printf("%d ",a[i][j]);
					}
					else
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}


}

