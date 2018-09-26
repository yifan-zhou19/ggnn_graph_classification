package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = {365, 366};
		int[][] ym =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int sta = 0;
		int end = 0;
		int stay;
		int stam;
		int stad;
		int endy;
		int endm;
		int endd;
		int y;
		int m;
		stay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		stam = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		stad = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		y = 0;
		m = 1;
		while (y < stay)
		{
			sta = sta + year[(y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)];
			y++;
		}
		while (m < stam)
		{
			sta = sta + ym[(y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)][m];
			m++;
		}
		sta = sta + stad;

		y = 0;
		m = 1;
		while (y < endy)
		{
			end = end + year[(y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)];
			y++;
		}
		while (m < endm)
		{
			end = end + ym[(y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)][m];
			m++;
		}
		end = end + endd;

		System.out.print(end - sta);
		System.out.print("\n");
		return 0;
	}


}

