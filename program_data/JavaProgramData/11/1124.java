package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int daysum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] dayleap = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((y % 4 != 0) || ((y % 100 == 0) && (y % 400 != 0)))
		{
		  for (int i = 0;i < m;i++)
		  {
			 daysum += day[i];
		  }
		  daysum += d;
		}
		else
		{
		  for (int i = 0;i < m;i++)
		  {
			 daysum += dayleap[i];
		  }
		  daysum += d;
		}
		System.out.print(daysum);

		return 0;
	}

}

