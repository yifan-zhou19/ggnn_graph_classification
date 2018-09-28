package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int month1;
		int month2;
		int relation = 0;
		int middle;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{
				middle = month1;
				month1 = month2;
				month2 = middle;
			}
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				day[1] = 29;
				for (j = month1;j < month2;j++)
				{
					relation = relation + day[j - 1];
				}
				if (relation % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
				day[1] = 28;
			}
			else
			{
					for (j = month1;j < month2;j++)
					{
						relation = relation + day[j - 1];
					}
					if (relation % 7 == 0)
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
			relation = 0;
		}
		return 0;
	}
}

