package <missing>;

public class GlobalMembers
{
	//****************************
	//???????
	//???2013.12.14
	//****************************
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year = 0;
		int mon = 0;
		int day = 0;
		int i = 0;
		int sum = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
		{
			a[1] = 29;
		}
		for (i = 0;i < mon - 1;i++)
		{
			sum = sum + a[i];
		}
			sum = sum + day;
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}
}

