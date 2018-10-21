package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int temp;
		int x;
		int y;
		int flag = 0;
		int[][] a = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;++i)
		{
			for (j = 0;j < col;++j)
			{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i] + j = Integer.parseInt(tempVar3);
			   }
			}
		}
		for (i = 0;i < row;++i)
		{
			flag = 0;
			temp = -1000000;
			for (j = 0;j < col;++j)
			{
				if (temp < a[i][j])
				{
					temp = a[i][j];
					y = j;
				}
			}
			for (x = 0;x < row;++x)
			{
				if (a[x][y] < temp)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.printf("%d+%d",i,y);
				return 0;
			}
		}
		System.out.print("No");
		return 0;
	}

}

