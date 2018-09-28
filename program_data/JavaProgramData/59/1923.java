package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int row;
		int col;
		int m;
		int k;
		int[] N = new int[100];
		int d;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		N[1] = 0;
		for (row = 1;row <= n;row++)
		{
			for (col = 1;col <= n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[row][col] = tempVar2.charAt(0);
				}
				b[row][col] = a[row][col];
				if (a[row][col] == '@')
				{
					N[1]++;
				}
			}
			scanf("\n");
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (row = 0;row <= n + 1;row++)
		{
			for (col = 0;col <= n + 1;col++)
			{
				if (row == 0 || row == n + 1 || col == 0 || col == n + 1)
				{
					a[row][col] = '#';
					b[row][col] = a[row][col];
				}
			}
		}
		for (k = 1;k <= m - 1;k++)
		{
			d = 0;
			N[k + 1] = 0;
			for (row = 1;row <= n;row++)
			{
				for (col = 1;col <= n;col++)
				{
					if (a[row][col] == '@')
					{
						if (a[row][col + 1] == '.')
						{
							b[row][col + 1] = '@';
						}
						else
						{
							;
						}
						if (a[row][col - 1] == '.')
						{
							b[row][col - 1] = '@';
						}
						else
						{
							;
						}
						if (a[row - 1][col] == '.')
						{
							b[row - 1][col] = '@';
						}
						else
						{
							;
						}
						if (a[row + 1][col] == '.')
						{
							b[row + 1][col] = '@';
						}
						else
						{
							;
						}
					}
				}
			}
		   for (row = 1;row <= n;row++)
		   {
			   for (col = 1;col <= n;col++)
			   {
				   a[row][col] = b[row][col];
				   if (a[row][col] == '@')
				   {
					   N[k + 1]++;
				   }
			   }
		   }
		}
		System.out.printf("%d",N[m]);
		return 0;
	}

}

