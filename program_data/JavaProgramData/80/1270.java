package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Sy;
		int Sm;
		int Sd;
		int Ey;
		int Em;
		int Ed;
		int year;
		int month;
		int day;
		int x;
		int[] Y = {365, 366};
		int[][] M =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		Sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year = Sy;
		x = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		if (Sy == Ey)
		{
			if (Sm == Em)
			{
				System.out.print(Ed - Sd);
				System.out.print("\n");
			}
			else if (Em - Sm == 1)
			{
				System.out.print(M[x][Sm - 1] - Sd + Ed);
				System.out.print("\n");
			}
			else
			{
					day = M[x][Sm - 1] - Sd;
					for (month = Sm;month < Em - 1;month++)
					{
							day += M[x][month];
					}
					System.out.print(day);
					System.out.print("\n");
			}

		}
		else if (Ey - Sy == 1)
		{

			day = M[x][Sm - 1] - Sd;
			for (month = Sm;month < 12;month++)
			{
				day += M[x][month];
			}
			year = Ey;
			x = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
			for (month = 0;month < Em - 1;month++)
			{
				day += M[x][month];
			}
			day += Ed;
			System.out.print(day);
			System.out.print("\n");
		}
		else
		{
			day = M[x][Sm - 1] - Sd;
			for (month = Sm;month < 12;month++)
			{
				day += M[x][month];
			}
			for (year = Sy + 1;year < Ey;year++)
			{
				x = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
				day += Y[x];
			}
			for (month = 0;month < Em - 1;month++)
			{
					year = Ey;
					x = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
					day += M[x][month];
			}
			day += Ed;
			System.out.print(day);
			System.out.print("\n");
		}
		return 0;
	}

}

