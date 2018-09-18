package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1001][1001];

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0; i < n; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int sx;
		int sy;
		int ex;
		int ey;
		int flag = 0;
		for (i = 0; i < n; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				if (a[i][j] == 0 && flag == 0)
				{
					sx = i;
					sy = j;
					flag = 1;
				}
				else if (a[i][j] == 0 && flag == 1)
				{
					ex = i;
					ey = j;
				}
			}
		}
		sx += 1;
		sy += 1;
		ex -= 1;
		ey -= 1;
		int sum = (ex - sx + 1) * (ey - sy + 1);
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

