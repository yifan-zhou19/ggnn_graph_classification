package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < m;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (n < m)
		{
		   for (i = 0;i < n;i++)
		   {
			   for (row = 0;row <= i;row++)
			   {
				   System.out.printf("%d\n",a[row][i - row]);
			   }
		   }
		   for (i = n;i < m;i++)
		   {
			   for (row = 0;row < n;row++)
			   {
				   System.out.printf("%d\n",a[row][i - row]);
			   }
		   }
		   for (i = m;i < n + m - 1;i++)
		   {
			   for (col = m - 1;col >= i - n + 1;col--)
			   {
			   System.out.printf("%d\n",a[i - col][col]);
			   }
		   }
		}
		if (n >= m)
		{
			for (i = 0;i < m;i++)
			{
				for (row = 0;row <= i;row++)
				{
					System.out.printf("%d\n",a[row][i - row]);
				}
			}
			for (i = m;i < n;i++)
			{
				for (col = m - 1;col >= 0;col--)
				{
					System.out.printf("%d\n",a[i - col][col]);
				}
			}
			for (i = n;i < n + m - 1;i++)
			{
				for (col = m - 1;col >= i - n + 1;col--)
				{
				System.out.printf("%d\n",a[i - col][col]);
				}
			}
		}
		return 0;
	}
}

