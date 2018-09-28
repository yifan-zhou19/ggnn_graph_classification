package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
		int year;
		int month1;
		int month2;
		int sum = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month1 > month2)
		{
			swap(month1, month2);
		}
		for (int i = month1; i <= month2 - 1; i++)
		{
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				sum += m2[i - 1];
			}
			else
			{
				sum += m1[i - 1];
			}
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
		return 0;
	}

}

