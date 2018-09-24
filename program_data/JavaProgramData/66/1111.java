package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5, 1};
		int[] b = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6, 2};
		int year;
		int mon;
		int day;
		int i;
		int sum = 0;
		int t;
		int n;

		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		sum = n * 2 + (year - 1 - n);

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			sum = sum + b[mon - 1] + day;
		}
		else
		{
			sum = sum + a[mon - 1] + day;
		}

		t = sum % 7;
		switch (t)
		{
			case 0:
				System.out.print("Sun.");
				break;
			case 1:
				System.out.print("Mon.");
				break;
			case 2:
				System.out.print("Tue.");
				break;
			case 3:
				System.out.print("Wed.");
				break;
			case 4:
				System.out.print("Thu.");
				break;
			case 5:
				System.out.print("Fri.");
				break;
			case 6:
				System.out.print("Sat.");
				break;
		}
		return 0;
	}
}

