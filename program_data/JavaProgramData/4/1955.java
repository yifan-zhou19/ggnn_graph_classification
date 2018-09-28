package <missing>;

public class GlobalMembers
{
	public static void Main()
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
			k = 0;
			l = j;
			while (k < row && l >= 0)
			{
				System.out.printf("%d\n",a[k][l]);
				k++;
				l--;
			}
		}
		for (i = 1;i < row;i++)
		{
			k = i;
			l = col - 1;
			while (k < row && l >= 0)
			{
				System.out.printf("%d\n",a[k][l]);
				k++;
				l--;
			}
		}


	}
}

