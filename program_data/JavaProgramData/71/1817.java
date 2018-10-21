package <missing>;

public class GlobalMembers
{
	/*
	 * Author : houchenglong
	 * 2014.1.5
	 *
	 */
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int sum = 0;
		int i;
		int j;
		int[] Mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
			{
				Mon[1] = Mon[1] + 1;
				if (month1 > month2)
				{
					for (j = month2;j < month1;j++)
					{
						sum = sum + Mon[j - 1];
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
					for (j = month1;j < month2;j++)
					{
						sum = sum + Mon[j - 1];
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
			else
			{
				if (month1 > month2)
				{
					for (j = month2;j < month1;j++)
					{
						sum = sum + Mon[j - 1];
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
					for (j = month1;j < month2;j++)
					{
						sum = sum + Mon[j - 1];
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
			sum = 0;
			Mon[1] = 28;
		}
		return 0;
	}


}

