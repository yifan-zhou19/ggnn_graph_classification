package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int col;
		int row;
		int i;
		int j;
		int k;
		int min;
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
		for (j = 0;j < col;j++)
		{
		for (i = 0, k = j;(k >= 0 && i < row) == 1;)
		{
			System.out.printf("%d\n",a[i][k]);
			i++;
			k--;
		}
		}
		for (i = 1;i < row;i++)
		{
		for (j = col - 1, k = i;(j >= 0 && k < row) == 1;)
		{
			System.out.printf("%d\n",a[k][j]);
			j--;
			k++;
		}
		}
	}
}

