package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int x;
		int y;
		int[][] a = new int[100][100];
		int flag = 0;
		int i;
		int k;
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
		for (x = 0;x < row;x++)
		{
			for (y = 0;y < col;y++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[x][y] = Integer.parseInt(tempVar3);
				}
			}
		}
		k = (row > col)?col:row;
		for (i = 0;i < k;i++)
		{
			for (y = i;y < col - i;y++)
			{
				System.out.printf("%d\n",a[i][y]);
				flag++;
			}
			  if (flag == row * col)
			  {
				  break;
			  }
			for (x = i + 1;x < row - i;x++)
			{
				System.out.printf("%d\n",a[x][col - 1 - i]);
				flag++;
			}
			if (flag == row * col)
			{
				  break;
			}
			for (y = col - 2 - i;y >= i;y--)
			{
				System.out.printf("%d\n",a[row - 1 - i][y]);
				flag++;
			}
			if (flag == row * col)
			{
				  break;
			}
			for (x = row - 2 - i;x > i;x--)
			{
				System.out.printf("%d\n",a[x][i]);
				flag++;
			}
			if (flag == row * col)
			{
				  break;
			}
		}
		return 0;
	}

}

