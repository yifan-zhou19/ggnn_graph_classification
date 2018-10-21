package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int xxrow;
		int sxrow;
		int xxcol;
		int sxcol;
		int i;
		int j;
		int[][] sz = new int[100][100];
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = 0;
		xxrow = 0;
		sxrow = row - 1;
		xxcol = 0;
		sxcol = col - 1;
		while (xxrow < sxrow && xxcol < sxcol)
		{
			for (j = xxcol;j < sxcol;j++)
			{
				System.out.printf("%d\n",sz[xxrow][j]);
			}
			for (i = xxrow;i < sxrow;i++)
			{
				System.out.printf("%d\n",sz[i][sxcol]);
			}
			for (j = sxcol;j > xxrow;j--)
			{
				System.out.printf("%d\n",sz[sxrow][j]);
			}
			for (i = sxrow;i > xxrow;i--)
			{
				System.out.printf("%d\n",sz[i][xxcol]);
			}
			xxrow++;
			sxrow--;
			xxcol++;
			sxcol--;
		}
		if (xxrow == sxrow || xxcol == sxcol)
		{
			if (xxrow == sxrow && xxcol != sxcol)
			{
				for (j = xxcol;j <= sxcol;j++)
				{
					System.out.printf("%d\n",sz[xxrow][j]);
				}
			}
			if (xxrow != sxrow && xxcol == sxcol)
			{
				for (i = xxrow;i <= sxrow;i++)
				{
					System.out.printf("%d\n",sz[i][xxcol]);
				}
			}
			if (xxrow == sxrow && xxcol == sxcol)
			{
				System.out.printf("%d\n",sz[xxrow][xxcol]);
			}
		}
		return 0;
	}



}

