package <missing>;

public class GlobalMembers
{
	public static int checkrun(int a)
	{
		if (a % 4 != 0)
		{
			return 0;
		}
		else
		{
			if (a % 100 == 0)
			{
				if (a % 400 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return 1;
			}
		}
	}
	public static int Main()
	{
		int n;
		int month1;
		int month2;
		int i;
		int year;
		int temp;
		int day;
		int j;
		int[] a1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] a2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < n; j++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 < month2)
			{
				;
			}
			else
			{
				temp = month1;
				month1 = month2;
				month2 = temp;
			}
			if (checkrun(year) != 1)
			{
				day = 0;
				for (i = month1; i < month2; i++)
				{
					day = day + a1[i];
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
			else
			{
				day = 0;
				for (i = month1; i < month2; i++)
				{
					day = day + a2[i];
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
		}
		return 0;
	}

}

