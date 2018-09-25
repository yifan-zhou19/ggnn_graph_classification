package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int i;
		int j;

		for (i = 0; i < 2; i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			day[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		int sum = 0;

		for (i = year[0] + 1; i < year[1]; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}

		for (j = month[0]; j <= 12; j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				sum += 31;
			}
			else if (j == 2)
			{
				if ((year[0] % 4 == 0 && year[0] % 100 != 0) || (year[0] % 400 == 0))
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
			else
			{
				sum += 30;
			}
		}

		for (j = 1; j < month[1]; j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				sum += 31;
			}
			else if (j == 2)
			{
				if ((year[1] % 4 == 0 && year[1] % 100 != 0) || (year[1] % 400 == 0))
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
			else
			{
				sum += 30;
			}
		}

		sum = sum - day[0] + day[1];
		if (year[1] == year[0])
		{
			if ((year[0] % 4 == 0 && year[0] % 100 != 0) || (year[0] % 400 == 0))
			{
				sum -= 366;
			}
			else
			{
				sum -= 365;
			}
		}

		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

