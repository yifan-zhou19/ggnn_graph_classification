package <missing>;

public class GlobalMembers
{
	public static int min(int a,int b)
	{
		if (a < b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int k;
		int l;
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
		for (i = 0;i < col;i++)
		{
			for (j = 0;j < min(i + 1, row);j++)
			{
			System.out.printf("%d\n",a[j][i - j]);
			}
		}
		for (k = 1;k < row;k++)
		{
			  for (l = 0;l < min(row - k, col);l++)
			  {
			  System.out.printf("%d\n",a[k + l][col - 1 - l]);
			  }
		}
	}
}

