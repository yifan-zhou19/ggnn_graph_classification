package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[101][101];
		int i;
		int j;
		int row;
		int col;
		//freopen("1.txt","r",stdin);
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
		for (i = 1;i <= row;i++)
		{
		for (j = 1;j <= col;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num[i][j] = Integer.parseInt(tempVar3);
		}
		}
		}
		System.out.printf("%d",num[1][1]);
		for (i = 3;i <= col + row;i++)
		{
							   for (j = 1;j < i;j++)
							   {
							   if (j <= row != 0 && i - j <= col)
							   {
							   System.out.printf("\n%d",num[j][i - j]);
							   }
							   }
		}
		//getch();
		return 0;
	}

}

