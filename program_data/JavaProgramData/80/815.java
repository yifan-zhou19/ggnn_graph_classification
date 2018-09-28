package <missing>;

public class GlobalMembers
{
	public static int[] month1 = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	public static int[] month2 = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int sum = 0;
		int i;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1; i < y2; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			sum += month2[m2 - 1] - month2[m1 - 1];
		}
		else
		{
			sum += month1[m2 - 1] - month1[m1 - 1];
		}
		sum += d2 - d1;
		System.out.print(sum);
		return 0;
	}
}

