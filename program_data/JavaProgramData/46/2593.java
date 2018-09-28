package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		int t;
		int k = 0;
		int m = 1;
		int c;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = 0;
		if (col < row)
		{
			t = 2 * col + 1;
		}
		else
		{
			t = 2 * row;
		}
		u = t;
		for (;t != 1;t--)
		{
			if (t % 4 == u % 4)
			{
				for (c = col - k;c != 0;j++)
				{
					System.out.printf("%d\n",a[i][j]);
					c--;
				}
				k++;
				j--;
				i++;
			}
			else if (t % 4 == (u - 1) % 4)
			{
				for (c = row - m;c != 0;i++)
				{
					System.out.printf("%d\n",a[i][j]);
					c--;
				}
				m++;
				i--;
				j--;
			}
			else if (t % 4 == (u - 2) % 4)
			{
				for (c = col - k;c != 0;j--)
				{
					System.out.printf("%d\n",a[i][j]);
					c--;
				}
				k++;
				j++;
				i--;
			}
			else if (t % 4 == (u - 3) % 4)
			{
				for (c = row - m;c != 0;i--)
				{
					System.out.printf("%d\n",a[i][j]);
					c--;
				}
				m++;
				i++;
				j++;
			}
		}
	}


}

