package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int leap;
		int day;
		int i;
		int n;
		int y;
		int dy;
		int de;
		int m;
		int k = 0;
		int z;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			de = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (dy > de)
			{
				z = dy;
				dy = de;
				de = z;
			}
			leap = y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
			for (m = dy; m <= de - 1; m++)
			{
				switch (m)
				{
					case 1:
						day = 31;
						break;
					case 2:
						day = 28 + leap;
						break;
					case 3:
						day = 31;
						break;
					case 4:
						day = 30;
						break;
					case 5:
						day = 31;
						break;
					case 6:
						day = 30;
						break;
					case 7:
						day = 31;
						break;
					case 8:
						day = 31;
						break;
					case 9:
						day = 30;
						break;
					case 10:
						day = 31;
						break;
					case 11:
						day = 30;
						break;
					case 12:
						day = 31;
						break;
				}
				k = k + day;
			}
			if (k % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			k = 0;
		}
		return 0;
	}
}

