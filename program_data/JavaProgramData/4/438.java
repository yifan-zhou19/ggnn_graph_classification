package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int r;
		int c;
		int num;
		int ro;
		int co;
		int[][] a = new int[100][100];
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
		r = 1;
		c = 1;
		while (true)
		{
			ro = r;
			co = c;
			while (true)
			{
				System.out.printf("%d\n",a[ro][co]);
				ro++;
				co--;
				if (ro > row || co <= 0)
				{
					break;
				}
			}
			if (c == col && r == row)
			{
				break;
			}
			if (c < col)
			{
				c++;
			}
			else
			{
				r++;
			}
		}
		return 0;
	}
}

