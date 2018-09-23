package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int total = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) //???
		{
		  int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
		  for (int i = 1;i <= month - 1;i++)
		  {
			   total = total + a[i - 1];
		  }
			total = total + day;

		}
		else
		{
			 int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
			 for (int j = 1;j <= month - 1;j++)
			 {
			   total = total + b[j - 1];
			 }
			total = total + day;
		}
		System.out.print(total);
		System.out.print("\n");

		return 0;
	}
}

