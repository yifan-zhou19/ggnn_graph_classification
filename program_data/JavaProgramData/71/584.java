package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int year;
		int month1;
		int month2;
		for (int i = 1; i <= n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int difference = month1 - month2;
			if (difference > 0)
			{
				month1 -= difference;
				month2 += difference;
			}
			int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (((!(year % 4)) && (year % 100)) || !(year % 400))
			{
				m[2] = 29;
			}
			int d = 0;
			for (int j = month1; j < month2; j++)
			{
				d += m[j];
			}
			if (d % 7 != 0)
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			else
			{
				System.out.print("YES");
				System.out.print("\n");
			}
		}

		return 0;
	}
}

