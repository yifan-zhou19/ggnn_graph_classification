package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int sx = 0;
		int sy = 0;
		int an = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] jx = new int[10];
		int[] jy = new int[10];
		jx[0] = x,jy[0] = y;
		sx++;
		for (int i = 1;jx[i - 1] >= 2;i++)
		{
			jx[i] = jx[i - 1] / 2;
			sx++;
		}
		for (int i = 1;jy[i - 1] >= 2;i++)
		{
			jy[i] = jy[i - 1] / 2;
			sy++;
		}
		for (int i = 0;i <= sx;i++)
		{
			if (an != 0)
			{
				System.out.print(an);
					  break;
			}
			for (int j = 0;j <= sy;j++)
			{
				if (jx[i] == jy[j])
				{
					an = jx[i];
					break;
				}
			}
		}
		return 0;
	}
}

