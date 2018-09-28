package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int rowm;
		int coln;
		int i;
		int j;
		int row;
		int col;
		rowm = 1;
		coln = 0;
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
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			i = 1;
			j = 0;
		while (true)
		{
			if (coln >= col)
			{
				break;
			}
			for (i = rowm,j++;j <= col;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			coln++;
			if (rowm >= row)
			{
				break;
			}
			for (j = col,i++;i <= row;i++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			rowm++;
			if (coln >= col)
			{
				break;
			}
			for (i = row,j--;j >= coln;j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			col--;
			if (rowm >= row)
			{
				break;
			}
			for (j = coln,i--;i >= rowm;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			row--;
		}
	}
}

