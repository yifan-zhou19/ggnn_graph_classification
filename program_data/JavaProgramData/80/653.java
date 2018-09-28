package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int m1;
		int d1;
		int year2;
		int m2;
		int d2;
		int i;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int[] mm1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mm2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = year1;i < year2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			for (i = 1;i < m1;i++)
			{
			   sum1 = sum1 + mm1[i];
			}
		}
		else
		{
			for (i = 1;i < m1;i++)
			{
			   sum1 = sum1 + mm2[i];
			}
		}
		sum1 = sum1 + d1;
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			for (i = 1;i < m2;i++)
			{
			   sum2 = sum2 + mm1[i];
			}
		}
		else
		{
			for (i = 1;i < m2;i++)
			{
			   sum2 = sum2 + mm2[i];
			}
		}
		sum2 = sum2 + d2;
		System.out.print(sum - sum1 + sum2);
			return 0;
	}
}

