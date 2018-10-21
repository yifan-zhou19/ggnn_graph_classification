package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : ex3.37.cpp
	// Author      : Zhang Yu
	// Version     :
	// Copyright   : Your copyright notice
	// Description : ???
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;++i)
		{
			int year;
			int month1;
			int month2;
			int deltaday = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{
				int exchange = month2;
				month2 = month1;
				month1 = exchange;
			}
			if (((year % 400) == 0) || ((year % 100 != 0) && (year % 4 == 0)))
			{
				for (int j = month1;j <= month2 - 1;++j)
				{
					switch (j)
					{
					case 1:
						deltaday += 31;
						break;
					case 2:
						deltaday += 29;
						break;
					case 3:
						deltaday += 31;
						break;
					case 4:
						deltaday += 30;
						break;
					case 5:
						deltaday += 31;
						break;
					case 6:
						deltaday += 30;
						break;
					case 7:
						deltaday += 31;
						break;
					case 8:
						deltaday += 31;
						break;
					case 9:
						deltaday += 30;
						break;
					case 10:
						deltaday += 31;
						break;
					case 11:
						deltaday += 30;
						break;
					}
				}
			}
			else
			{
				for (int j = month1;j <= month2 - 1;++j)
				{
					switch (j)
					{
					case 1:
						deltaday += 31;
						break;
					case 2:
						deltaday += 28;
						break;
					case 3:
						deltaday += 31;
						break;
					case 4:
						deltaday += 30;
						break;
					case 5:
						deltaday += 31;
						break;
					case 6:
						deltaday += 30;
						break;
					case 7:
						deltaday += 31;
						break;
					case 8:
						deltaday += 31;
						break;
					case 9:
						deltaday += 30;
						break;
					case 10:
						deltaday += 31;
						break;
					case 11:
						deltaday += 30;
						break;
					}
				}
			}
			if ((deltaday) % 7 == 0)
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

