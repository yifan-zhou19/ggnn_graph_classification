package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < 2;i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			day[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int sum = 0;
		for (i = year[0];i < year[1];i++)
		{
			sum += 365;
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				sum++;
			}
		}
		for (i = 1;i < month[1];i++)
		{
			sum += mon[i];
		}
		for (i = 1;i < month[0];i++)
		{
			sum -= mon[i];
		}
		sum += day[1];
		sum -= day[0];
		if ((year[1] % 4 == 0 && year[1] % 100 != 0 || year[1] % 400 == 0) && month[1] > 2)
		{
			sum++;
		}
		if ((year[0] % 4 == 0 && year[0] % 100 != 0 || year[0] % 400 == 0) && month[0] > 2)
		{
			sum--;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

