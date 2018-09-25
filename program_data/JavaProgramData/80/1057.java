package <missing>;

public class GlobalMembers
{
	public static int[] year = {365, 366};
	public static int[][] month =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};



	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ans = 0;
		while (y1 != y2 || m1 != m2 || d1 != d2)
		{
			   ans++;
			   d1++;
			   int leapyear = ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0);
			   if (d1 > month[leapyear][m1 - 1])
			   {
					d1 = 1;
					m1++;
			   }
			   if (m1 > 12)
			   {
				   m1 = 1;
				   y1++;
			   }
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}




}

