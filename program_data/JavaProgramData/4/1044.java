package <missing>;

public class GlobalMembers
{
	public static void bianli()
	{
		int[][] a = new int[maxrow][maxcol];
		int row;
		int col;
		int i;
		int j;
		int k;
		int n;
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

		for (n = 0;n < col;n++)
		{
			i = 0;
			j = n;
			for (k = n;k >= 0;k--)
			{
				System.out.printf("%d\n",a[i][j]);
				i++;
				j--;
				if (i >= row != 0 || j >= col)
				{
					break;
				}
			}
		}
		for (n = 1;n < row;n++)
		{
			i = n;
			j = col - 1;
			for (k = n;k <= row - 1;k++)
			{
				System.out.printf("%d\n",a[i][j]);
				i++;
				j--;
				if (i >= row != 0 || j < 0)
				{
					break;
				}
			}
		}
	}
	public static void Main()
	{
		bianli();
	}
}

