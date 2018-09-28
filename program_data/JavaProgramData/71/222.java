package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_1.cpp
	* @author ??
	* @date 2010-10-27
	* @description
	* ??????:???
	*/

	public static int Main()
	{
		int n;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			int year;
			int month1;
			int month2;
			int t;
			int sum = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{
				t = month1;
				month1 = month2;
				month2 = t;
			}
			for (int j = month1; j < month2; j++)
			{
				if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10) || (j == 12))
				{
					sum += 31;
				}
				else if ((j == 4) || (j == 6) || (j == 9) || (j == 11))
				{
					sum += 30;
				}
				else
				{
					if (!(year % 400) || ((year % 100) && !(year % 4)))
					{
						sum += 29;
					}
					else
					{
						sum += 28;
					}
				}
			}
			if (sum % 7 != 0)
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

