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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] commonyear = {0, 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int[] leapyear = {0, 0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
		for (i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				if (leapyear[month1] == leapyear[month2])
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
				if (commonyear[month1] == commonyear[month2])
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

