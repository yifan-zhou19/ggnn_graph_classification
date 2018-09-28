package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int h;
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = -1;
		for (h = 0;;h++)
		{
			for (j++;j < col - h;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			j--;
			if (i >= row - h - 1)
			{
				break;
			}
			for (i++;i < row - h;i++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			i--;
			if (j < h + 1)
			{
				break;
			}
			for (j--;j >= h;j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			j++;
			if (i < h + 2)
			{
				break;
			}
			for (i--;i >= h + 1;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			i++;
			if (j >= col - h - 1)
			{
				break;
			}
		}


		return 0;
	}


}

