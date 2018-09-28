package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int line;
	int l;
	int r;
	int t = 9;
	int s = 9;
	int q = 9;
		int[][] a = new int[8][8];
		int max = 0;
		int min = 100;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			line = Integer.parseInt(tempVar2);
		}
		for (r = 0;r < row;r++)
		{
			for (l = 0;l < line;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[r][l] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (r = 0;r < row;r++)
		{
			for (l = 0;l < line;l++)
			{
				if (max < a[r][l])
				{
					max = a[r][l];
					t = l;
				}
			}
			for (s = 0;s < row;s++)
			{
				if (min > a[s][t])
				{
					min = a[s][t];
					q = s;
				}
			}
			if (max == min)
			{
				break;
			}
			else
			{
				q = 9;
				t = 9;
			}
		}
		if (q != 9 && t != 9)
		{
			System.out.printf("%d+%d", q, t);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

