package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day;
		int i;
		int sum = 0;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 12;i++)
		{
			if ((sum + 12 + (day - 5)) % 7 == 0)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			sum += month_days[i];
		}

		return 0;
	}
}

