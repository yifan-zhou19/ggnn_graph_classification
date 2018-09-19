package <missing>;

public class GlobalMembers
{
	//************************************
	//*   ????                       *
	//*   ??????                   *
	//*   ?????2011?12?30?       *
	//************************************


	public static int Main()
	{
		int n;
		int i;
		int j;
		(int)(*p)[101];
		int x1;
		int y1;
		int x2;
		int y2;
		int flag1;
		int flag2;
		int[][] a = new int[101][101];
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		flag1 = 0;
		flag2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = a;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(*(p + i) + j) == 0)
				{
					x1 = i;
					y1 = j;
					flag1 = 1;
					break;
				}
			}
			if (flag1 == 1)
			{
				break;
			}
		}
		for (i = n - 1; i >= 0; i--)
		{
			for (j = n - 1; j >= 0; j--)
			{
				if (*(*(p + i) + j) == 0)
				{
					x2 = i;
					y2 = j;
					flag2 = 1;
					break;
				}
			}
			if (flag2 == 1)
			{
				break;
			}
		}
		System.out.print((x2 - x1 - 1) * (y2 - y1 - 1));
		System.out.print("\n");
		return 0;
	}
}

