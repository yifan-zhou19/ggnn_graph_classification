package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] max = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int rank = 0;
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			max[2] += 1;
		}
		for (i = 1;i < m;i++)
		{
			rank += max[i];
		}
		rank += d;
		System.out.print(rank);
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

