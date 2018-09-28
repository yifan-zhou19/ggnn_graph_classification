package <missing>;

public class GlobalMembers
{
	//****************************
	//????????
	//???2013.12.14
	//****************************
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year = 0;
		int mm = 0;
		int dd = 0;
		int i = 0;
		int j = 0;
		long sum = 0;
		String[] c = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = (year - 1) / 4 - ((year - 1) / 100 - (year - 1) / 400);
		sum = sum + i;
		sum += (long)(year - 1) * 365;
		if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
		{
			a[1] = 29;
		}
		if (mm > 1)
		{
		   for (j = 0;j < mm - 1;j++)
		   {
			   sum = sum + a[j];
		   }
		}
		   sum = sum + dd;
			System.out.print(c[(sum - 1) % 7]);
		System.out.print("\n");
		return 0;
	}

}

