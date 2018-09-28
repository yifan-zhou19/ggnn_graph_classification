package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int ye1;
		int mon1;
		int day1;
		int ye2;
		int mon2;
		int day2;
		int sum = 0;
		int i;
		ye1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ye2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (ye1 == ye2)
		{
			if (mon1 == mon2)
			{
				System.out.print(day2 - day1);
				return 0;
			}
			else
			{
				if ((ye1 % 4 == 0 && ye1 % 100 != 0) || (ye1 % 400 == 0))
				{
					sum = sum + month2[mon1] - day1;
					for (i = mon1 + 1; i < mon2; i++)
					{
						sum = sum + month2[i];
					}
					sum = sum + day2;
					System.out.print(sum);
				}
				else
				{
					sum = sum + month1[mon1] - day1;
					for (i = mon1 + 1; i < mon2; i++)
					{
						sum = sum + month1[i];
					}
					sum = sum + day2;
					System.out.print(sum);
				}
			}
		}
		else
		{
			if ((ye1 % 4 == 0 && ye1 % 100 != 0) || (ye1 % 400 == 0))
			{
				sum = sum + month2[mon1] - day1;
				for (i = mon1 + 1; i <= 12; i++)
				{
					sum = sum + month2[i];
				}
			}
			else
			{
				sum = sum + month1[mon1] - day1;
				for (i = mon1 + 1; i <= 12; i++)
				{
					sum = sum + month1[i];
				}
			}
			for (i = ye1 + 1; i <= ye2 - 1; i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					sum = sum + 366;
				}
				else
				{
					sum = sum + 365;
				}
			}
				if ((ye2 % 4 == 0 && ye2 % 100 != 0) || (ye2 % 400 == 0))
				{
				sum = sum + day2;
				for (i = 1; i <= mon2 - 1; i++)
				{
					sum = sum + month2[i];
				}
				}
			else
			{
				sum = sum + day2;
				for (i = 1; i <= mon2 - 1; i++)
				{
					sum = sum + month1[i];
				}
			}
			System.out.print(sum);
		}
		return 0;
	}






}

