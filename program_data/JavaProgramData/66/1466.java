package <missing>;

public class GlobalMembers
{
	public static int[] sum = new int[1000000];
	public static final int pi = 365 * 3 + 366;
	public static int[][] a =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static int Main()
	{
		int jud;
		int y;
		int m;
		int d;
		int i;
		int j;
		int t;
		int to = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = y;
		if (y > 1)
		{
			if (j > 2000)
			{
				for (i = 0;;i++)
				{
					sum[i] = 0;
					if (j < 2000)
					{
						break;
					}
					sum[i] += 2000 / 4 * pi;
					j -= 2000;
				}
				sum[i] += (j - 1) % 4 * 365;
				sum[i] += (j - 1) / 4 * pi;
			}
			else
			{
				i = 0;
				sum[0] += (y - 1) % 4 * 365;
				sum[0] += (y - 1) / 4 * pi;
			}
		}
		for (t = 100;t < y;t += 100)
		{
			if (t % 100 == 0 && t % 400 != 0)
			{
				sum[i] -= 1;
			}
		}
		jud = (y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
		for (t = 0;t < m - 1;t++)
		{
			sum[i] += a[jud][t];
		}
		sum[i] += d - 1;
		for (j = 0;j <= i;j++)
		{
			to += sum[j] % 7;
		}
		switch (to % 7)
		{
		case 6:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		case 0:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Wed.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		}
		return 0;
	}
}

