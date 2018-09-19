package <missing>;

public class GlobalMembers
{
	//2013.12.9
	//zwb

	public static int Main()
	{
		int[][] a = new int[101][101];
		int n;
		int i;
		int j;
		int cnt = 0;
		int flag = 0;
		int firstx = 0;
		int firsty = 0;
		int lastx = 0;
		int lasty = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == 0)
				{
					flag = 1;
					firstx = i;
					firsty = j;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == 0)
				{
					lastx = i;
					lasty = j;
				}
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == 0)
				{
					cnt++;
				}
			}
		}

		System.out.print((lastx - firstx + 1) * (lasty - firsty + 1) - cnt);
		System.out.print("\n");
		return 0;
	}





}

