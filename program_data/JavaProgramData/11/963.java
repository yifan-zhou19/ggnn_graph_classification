package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] Day1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] Day2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int month;
		int day;
		int sumday = 0;
		int i;
		int j;

		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		{
			j = 1;
		}
		else
		{
			j = 0;
		}
		if (j == 1)
		{
			 if (month == 1)
			 {
			 System.out.print(day);
			 System.out.print("\n");
			 }
				if (month > 1)
				{
				 for (i = 0;i < month - 1;i++)
				 {
					 sumday = sumday + Day2[i];
				 }
					sumday = sumday + day;
				 System.out.print(sumday);
				 System.out.print("\n");
				}
		}
				if (j == 0)
				{

					   if (month == 1)
					   {
					  System.out.print(day);
					  System.out.print("\n");
					   }
						if (month > 1)
						{
						  for (i = 0;i < month - 1;i++)
						  {
							  sumday = sumday + Day1[i];
						  }
							sumday = sumday + day;
						  System.out.print(sumday);
						  System.out.print("\n");
						}

				}
		return 0;
	}
}

