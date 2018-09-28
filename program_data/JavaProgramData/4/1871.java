package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[num][num];
		int row;
		int col;
		int i;
		int j;
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
			if (j < row) //?????row??col???????col???0??
			{
				for (i = 0;i <= j;i++)
				{
					System.out.printf("%d\n",a[i][j - i]);
				}
			}

			else //col>row?????????row?????col++???
			{
				for (i = 0;i < row;i++)
				{
					System.out.printf("%d\n",a[i][j - i]);
				}
			}
		}

		for (j = col;j < col + row - 1;j++) //??????a[row-1][col-1]??j???
		{
			for (i = j - col + 1;j - i >= 0;i++) //??????col????1??????????j++???i??????
			{
				if (i < row)
				{
					System.out.printf("%d\n",a[i][j - i]);
				}
			}
		}
		return 0;
	}
}

