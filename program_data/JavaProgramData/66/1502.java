package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		int n = 0;
		int year = 0;
		int month = 0;
		int day = 0;
		int i;
		int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) //???????
		{
			a[1] = 29;
		}
		else
		{
			a[1] = 28;
		}
		year = (year - 1) % 400; //400??????7???
		n = year / 100;
		num += 2 * (year / 4 - n); //?????????7?2
		num += year - (year / 4 - n);
		for (i = 0;i < month - 1;i++)
		{
			num += a[i];
		}
		num += day; //?????
		num = num % 7;
		switch (num) //??????
		{
			case 0:
				System.out.print("Sun.");
				System.out.print("\n");
				break;
			case 1:
				System.out.print("Mon.");
				System.out.print("\n");
				break;
			case 2:
				System.out.print("Tue.");
				System.out.print("\n");
				break;
			case 3:
				System.out.print("Wed.");
				System.out.print("\n");
				break;
			case 4:
				System.out.print("Thu.");
				System.out.print("\n");
				break;
			case 5:
				System.out.print("Fri.");
				System.out.print("\n");
				break;
			case 6:
				System.out.print("Sat.");
				System.out.print("\n");
				break;
		}
		return 0;
	}
}

