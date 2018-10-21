package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int time = 0;
		int[][] a = new int[101][101];
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0,j = 0;;)
		{
			for (i++,j++;;j++)
			{
				if (a[i][j] == 0)
				{
					break;
				}
				System.out.printf("%d\n",a[i][j]);
				time++;
				a[i][j] = 0;
			}
			if (time == row * col)
			{
				break;
			}
			for (j = j - 1,i = i + 1;;i++)
			{
				if (a[i][j] == 0)
				{
					break;
				}
				System.out.printf("%d\n",a[i][j]);
				time++;
				a[i][j] = 0;
			}
			if (time == row * col)
			{
				break;
			}
			for (i--,j--;;j--)
			{
				if (a[i][j] == 0)
				{
					break;
				}
				System.out.printf("%d\n",a[i][j]);
				time++;
				a[i][j] = 0;
			}
			if (time == row * col)
			{
				break;
			}
			for (j++,i--;;i--)
			{
				if (a[i][j] == 0)
				{
					break;
				}
				System.out.printf("%d\n",a[i][j]);
				time++;
				a[i][j] = 0;
			}
			if (time == row * col)
			{
				break;
			}
		}
		return 0;
	}
}

