package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int[] pingnian = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] runnian = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int buffer;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{
				buffer = month1;
				month1 = month2;
				month2 = buffer;
			}

			buffer = 0;
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				for (int j = month1; j < month2; j++)
				{
					buffer = buffer + runnian[j - 1];
				}
				if (buffer % 7 == 0)
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
				for (int j = month1; j < month2; j++)
				{
					buffer = buffer + pingnian[j - 1];
				}
				if (buffer % 7 == 0)
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

