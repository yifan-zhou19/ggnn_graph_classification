package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		int xxrow;
		int sxrow;
		int xxcol;
		int sxcol;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		xxrow = 0;
		sxrow = row - 1;
		xxcol = 0;
		sxcol = col - 1;
		for (;1;)
		{
			if (xxrow == sxrow && xxcol <= sxcol)
			{
				for (i = xxcol;i <= sxcol;i++)
				{
					System.out.printf("%d\n",a[xxrow][i]);
				}
				break;
			}
			else if (xxcol == sxcol && xxrow < sxrow)
			{
				for (i = xxrow;i <= sxrow;i++)
				{
					System.out.printf("%d\n",a[i][xxcol]);
				}
				break;
			}
			if (xxcol > sxcol || xxrow > sxrow)
			{
				break;
			}
			for (i = xxcol;i <= sxcol - 1;i++)
			{
				System.out.printf("%d\n",a[xxrow][i]);
			}
			for (i = xxrow;i <= sxrow - 1;i++)
			{
				System.out.printf("%d\n",a[i][sxcol]);
			}
			for (i = sxcol;i >= xxcol + 1;i--)
			{
				System.out.printf("%d\n",a[sxrow][i]);
			}
			for (i = sxrow;i >= xxrow + 1;i--)
			{
				System.out.printf("%d\n",a[i][xxcol]);
			}
			xxrow++;
			xxcol++;
			sxrow--;
			sxcol--;
		}
		return 0;
	}
}

