package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int nx;
		int ny;
		int i;
		int j;
		int k;
		int[] ax = new int[20];
		int[] ay = new int[20];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x == y)
		{
			System.out.print(x);
			return 0;
		}
		nx = 1;
		while (x > 0)
		{
			ax[nx] = x;
			x /= 2;
			nx++;
		}
		nx--;
		ny = 1;
		while (y > 0)
		{
			ay[ny] = y;
			y /= 2;
			ny++;
		}
		ny--;
		for (i = nx + ny; ;i--)
		{
			if (ax[i - ny] != ay[i - nx])
			{
				System.out.print(ax[i + 1 - ny]);
				return 0;
			}
		}
	}
}

