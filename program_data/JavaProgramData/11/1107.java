package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int month;
		int day;
		int i;
		int k;
		int sum = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year % 400 == 0) //????
		{
			k = 1;
		}
		else if (year % 100 == 0)
		{
			k = 0;
		}
		else if (year % 4 == 0)
		{
			k = 1;
		}
		else
		{
			k = 0;
		}
		if (k == 1)
		{
			a[1] = 29;
		}
		for (i = 0;i < month - 1;i++)
		{
			sum += a[i];
		}
		sum += day;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

