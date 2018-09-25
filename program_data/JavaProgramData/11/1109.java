package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int year;
	 int mon;
	 int day;
	 year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 mon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int days = 0;
	 int[] ar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int[] br = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	 {
	 for (int i = 0;i < mon - 1;i++)
	 {
	 days += br[i];
	 }
	 }
	else
	{
	 for (int i = 0;i < mon - 1;i++)
	 {
	 days += ar[i];
	 }
	}
	days += day;
	System.out.print(days);
	System.out.print("\n");
	return 0;
	}
}

