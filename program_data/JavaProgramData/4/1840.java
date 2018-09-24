package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int k;
		int j;
		int i;
		int m;
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
		for (j = 0;j < row;j++)
		{
			for (i = 0;i < col;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < col;i++)
		{
			j = 0;
			for (m = i;(j < row) && (m >= 0);j++, m--)
			{
				System.out.printf("%d\n",a[j][m]);
			}
		}
		for (j = 1;j < row;j++)
		{
				i = col - 1;
				for (m = i, k = j;(k < row) && (m >= 0);k++, m--)
				{
				System.out.printf("%d\n",a[k][m]);
				}
		}

		return 0;
	}

}

