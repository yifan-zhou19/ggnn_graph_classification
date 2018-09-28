package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int row = 0;
		int line = 0;
		int l = 0;
		int[][] Matrix =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int total = 0;
		int extra = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (l < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				line = Integer.parseInt(tempVar3);
			}
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < line; j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						Matrix[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (row == 1 || line == 1)
			{
				for (int i = 0;i < row;i++)
				{
					for (int j = 0;j < line;j++)
					{
						total += Matrix[i][j];
					}
				}
			}
			else
			{
				extra = Matrix[0][0] + Matrix[0][line-1] + Matrix[row - 1][0] + Matrix[row - 1][line-1];
				for (int i = 0; i < line; i++)
				{
					a += Matrix[0][i];
					c += Matrix[row - 1][i];
				}
				for (int i = 0; i < row; i++)
				{
					b += Matrix[i][0];
					d += Matrix[i][line-1];
				}
				total = a + b + c + d - extra;
			}
				System.out.printf("%d\n", total);
				l++;
				a = 0;
				b = 0;
				c = 0;
				d = 0;
		}
		return 0;
	}
}

