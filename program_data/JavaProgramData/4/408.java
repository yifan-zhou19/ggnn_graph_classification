package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int row;
		int col;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row >= col)
		{
			for (n = 0;n <= col - 1;n++)
			{
			   for (i = 0;i <= n;i++)
			   {
				   System.out.printf("%d\n",a[i][n - i]);
			   }
			}
			for (n = col;n <= row - 1;n++)
			{
			   for (i = n - col + 1;i <= n;i++)
			   {
				   System.out.printf("%d\n",a[i][n - i]);
			   }
			}
			for (n = row;n <= row + col - 2;n++)
			{
				for (i = n - col + 1;i <= row - 1;i++)
				{
					System.out.printf("%d\n",a[i][n - i]);
				}
			}
		}
	/*	else if(row==col)
		{
			for(n=0;n<=row-1;n++)
				for(i=0;i<=n;i++)printf("%d\n",a[i][n-i]);
			for(n=row;n<=2*row-2;n++)
				for(i=n-row+1;i<=row-1;i++)printf("%d\n",a[i][n-i]);
		}?????1???????????????*/
		else
		{
			for (n = 0;n <= row - 1;n++)
			{
				for (i = 0;i <= n;i++)
				{
					System.out.printf("%d\n",a[i][n - i]);
				}
			}
			for (n = row;n <= col - 1;n++)
			{
				for (i = 0;i <= row - 1;i++)
				{
					System.out.printf("%d\n",a[i][n - i]);
				}
			}
			for (n = col;n <= row + col - 2;n++)
			{
				for (i = n - col + 1;i <= row - 1;i++)
				{
					System.out.printf("%d\n",a[i][n - i]);
				}
			}
		}
		return 0;
	}
}

