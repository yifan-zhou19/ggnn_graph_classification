package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Run = int;
		int[][] tianshu =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		}; //??????
		int n;
		int year;
		int month1;
		int month2;
		int temp;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int sum = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{ //???????
				temp = month1;
				month1 = month2;
				month2 = temp;
			}
			for (i = month1;i < month2;i++) //????
			{
				sum += tianshu[Run(year)][i];
			}
			if (sum % 7 == 0)
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
	}
	public static int Run(int year) //????
	{
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
				return 1;
		}
		else
		{
			return 0;
		}
	}

}

