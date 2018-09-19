package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = {365, 366};
		int[][] month =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int type;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			type = 1;
		}
		else
		{
			type = 0;
		}
		int i;
		int sum = 0;
		for (i = 0;i < m - 1;i++)
		{
			sum += month[type][i];
		}
		sum += d;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

