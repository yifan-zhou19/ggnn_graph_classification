package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int sum;
		int m = 0;
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
		sum = row * col;
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
		for (i = 0;i < row;i++)
		{
			for (j = i;j < col - i;j++)
			{
				System.out.printf("%d\n",a[i][j]);
				m++;
			}
			if (m == sum)
			{
				break;
			}
			i++;
			j--;
			for (;i < row - (col - j - 1);i++)
			{
				System.out.printf("%d\n",a[i][j]);
				m++;
			}
			if (m == sum)
			{
				break;
			}
			j--;
			i--;
			for (;j >= row - i - 1;j--)
			{
				System.out.printf("%d\n",a[i][j]);
				m++;
			}
			if (m == sum)
			{
				break;
			}
			i--;
			j++;
			for (;i > j;i--)
			{
				System.out.printf("%d\n",a[i][j]);
				m++;
			}
			if (m == sum)
			{
				break;
			}
		}
	}
}

