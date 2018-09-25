package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		final int[] c = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= m ; i++)
		{
			//const int c[13] = {0 , 31 , 0 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31} ;
			int year;
			int month1;
			int month2;
			int day = 0;
			int a;
			int b;
			int i;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{
				a = month2;
				b = month1;
			}
			else
			{
				a = month1;
				b = month2;
			}
			for (i = a ; i < b ; i++)
			{
				day = day + c[i];
			}
			if (a <= 2)
			{
				if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
				{
					day = day + 29;
				}
				else
				{
					 day = day + 28;
				}
			}

			if (day % 7 == 0)
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

