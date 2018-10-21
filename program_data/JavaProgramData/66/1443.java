package <missing>;

public class GlobalMembers
{
	public static int leap(int year)
	{
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
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
		int y;
		int m;
		int d;
		int leapn;
		int sum;
		int flag;
		int i;
		int[][] month =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		sum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y == 1111111111)
		{
			System.out.print("Sat.");
			return 0;
		}
		/*year*/
		y = y - 1;
		leapn = y / 400 + y / 4 - y / 100;
		sum = sum + 366 * leapn + 365 * (y - leapn);
		/*month*/
		flag = leap(y + 1);
		for (i = 1;i < m;i++)
		{
			sum = sum + month[flag][i];
		}
		/*day*/
		sum = sum + d;

		switch (sum % 7)
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

