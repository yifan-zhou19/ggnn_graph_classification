package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] b = {365, 366};
		int[][] a =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int dc;
		int j;
		int k;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dc = 0;
		if (ey == sy)
		{
			if ((sy % 4 == 0 && sy % 100 != 0) || sy % 400 == 0)
			{
				if (sm == em)
				{
					dc = ed - sd;
				}
				else
				{
					for (i = sm;i <= em - 1;i++)
					{
						dc = dc + a[1][i];
					}
					dc = dc + ed - sd;
				}
			}
			else
			{
				if (sm == em)
				{
					dc = ed - sd;
				}
				else
				{
					for (i = sm;i <= em - 1;i++)
					{
						dc = dc + a[0][i];
					}
					dc = dc + ed - sd;
				}
			}
		}
		else
		{
			for (i = sy;i <= ey - 1;i++)
			{
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				{
					dc = dc + b[1];
				}
				else
				{
					dc = dc + b[0];
				}
			}
			if ((sy % 4 == 0 && sy % 100 != 0) || sy % 400 == 0)
			{
				if (sm == em)
				{
					dc = dc + ed - sd;
				}
				else if (sm > em)
				{
					k = 0;
					for (i = em;i <= sm - 1;i++)
					{
						k = k + a[1][i];
					}
					dc = dc - k + ed - sd;
				}
				else
				{
					for (i = sm;i <= em - 1;i++)
					{
						dc = dc + a[1][i];
					}
					dc = dc + ed - sd;
				}
			}
			else
			{
				if (sm == em)
				{
					dc = dc + ed - sd;
				}
				else if (sm > em)
				{
					k = 0;
					for (i = em;i <= sm - 1;i++)
					{
						k = k + a[0][i];
					}
					dc = dc - k + ed - sd;
				}
				else
				{
					for (i = sm;i <= em - 1;i++)
					{
						dc = dc + a[0][i];
					}
					dc = dc + ed - sd;
				}
			}
			if (em > 2)
			{
				if ((ey % 4 == 0 && ey % 100 != 0) || ey % 400 == 0)
				{
					dc = dc + 1;
				}
			}
		}
		System.out.print(dc);
		System.out.print("\n");
		return 0;
	}

}

