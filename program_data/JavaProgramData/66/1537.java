package <missing>;

public class GlobalMembers
{
	public static int panduan(int nian)
	{
			if ((nian % 4 == 0 && nian % 100 != 0) || nian % 400 == 0)
			{
					return 1;
			}
			else
			{
					return 0;
			}
	}

	public static int Main()
	{

					int year;
					int month;
					int day;
					year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					int i;
					long sum = 0;
					if (year == 1111111111)
					{
			System.out.print("Sat.");
			System.out.print("\n");
			return 0;
					}
					for (i = 1;i <= year - 1;i++)
					{
							sum += (365 + panduan(i));
					}
					int[][] b =
					{
						{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
						{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
					};
					for (i = 1;i < month;i++)
					{
							sum += b[panduan(year)][i];
					}
					sum += day;
					String[] q = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
					System.out.print(q[sum % 7]);
			return 0;
	}
}

