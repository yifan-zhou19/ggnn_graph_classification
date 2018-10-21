package <missing>;

public class GlobalMembers
{
	public static int[][] daytable =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};

	public static int daynum(int year,int month,int day)
	{ //??????????
		int leap;
		int i;
		int day1;
		day1 = day;
		if (year % 4 != 0)
		{
			leap = 0;
		}
		else if (year % 100 == 0 && year % 400 != 0 || year % 3200 == 0)
		{
				  leap = 0;
		}
			 else
			 {
				 leap = 1; //???????
			 }
		for (i = 0;i < month - 1;i++)
		{
			day1 += daytable[leap][i];
		}
		return day1;
	}
	public static int Main()
	{
		int i;
		int k;
		int n;
		int y;
		int m1;
		int m2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = daynum(y, m1, 1) - daynum(y, m2, 1);
			k = Math.abs(k);
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
		}
		return 0;
	}
}

