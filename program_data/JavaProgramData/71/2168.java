package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] d =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int year;
			int month1;
			int month2;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{
				int temp;
				temp = month1;
				month1 = month2;
				month2 = temp;
			}
			int i;
			int sum = 0;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				for (i = month1;i < month2;i++)
				{
					sum += d[1][i - 1];
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
			else
			{
				for (i = month1;i < month2;i++)
				{
					sum += d[0][i - 1];
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
		return 0;
	}
}

