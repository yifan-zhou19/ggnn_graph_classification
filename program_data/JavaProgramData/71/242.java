package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int a;
		int b;
		int c;
		int i;
		int j;
		int day;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a > b)
			{
				c = a;
				a = b;
				b = c;
			}
			day = 0;
			for (j = a;j < b;j++)
			{
				day = day + 31;
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					day = day - 1;
				}
				if (j == 2)
				{
					if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					{
						day = day - 2;
					}
					else
					{
						day = day - 3;
					}
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

