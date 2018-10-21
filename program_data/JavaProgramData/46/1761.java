package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int row;
		int col;
		int[][] shuzu = new int[100][100];
		int n = 0;
		int m = 0;
		int b = 1;
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
				shuzu[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 0;;i++)
		{
			for (j = m;j < col - i;j++)
			{
			System.out.printf("%d\n",shuzu[i][j]);
			n++;
			}
			m++;
			if (n == row * col)
			{
			break;
			}
			for (j = b;j < row - i;j++)
			{
			k = col - 1 - i;
			System.out.printf("%d\n",shuzu[j][k]);
			n++;
			}
			b++;
			if (n == row * col)
			{
			break;
			}
			for (j = k - 1;j >= i;j--)
			{
			l = row - 1 - i;
			System.out.printf("%d\n",shuzu[l][j]);
			n++;
			}
			if (n == row * col)
			{
			break;
			}
			for (j = l - 1;j > i;j--)
			{
				System.out.printf("%d\n",shuzu[j][i]);
			n++;
			}
			if (n == row * col)
			{
			break;
			}
		}
		return 0;
	}

}

