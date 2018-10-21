package <missing>;

public class GlobalMembers
{
	public static int[][] ss =
	{
		{31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31}
	};
	public static String[] ans = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};

	public static int Main()
	{

		long year;
		long month;
		long day;
		year = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		month = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		day = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		long leapyear = 0;
	   // for(int i=1;i<year;i++) 
		// if(i%400==0 || (i%100!=0 && i%4==0)) 
		//  leapyear++;
		leapyear = (year - 1) / 4 - ((year - 1) / 100 - ((year - 1) / 100) / 4);
		long sum = 0;
		sum += 365 * (year - 1) + leapyear;
		int xx;
		for (int i = 1;i < month;i++)
		{
				if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
				{
				xx = 1;
				}
				else
				{
					xx = 0;
				}
				sum += ss[xx][i - 1];
		}
		sum += day;
		System.out.print(ans[sum % 7]);
		System.out.print("\n");
		return 0;
	}



}

