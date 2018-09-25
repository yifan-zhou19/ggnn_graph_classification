package <missing>;

public class GlobalMembers
{
	public static int[] m1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] m2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int i;
		int j;
		for (i = 0;i < 2;i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			day[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 1;j < month[i];j++)
			{
				if (year[i] % 4 != 0 || (year[i] % 100 == 0 && year[i] % 400 != 0))
				{
					day[i] += m1[j];
				}
				else
				{
					day[i] += m2[j];
				}
			}
		}
		for (i = year[1];i > year[0];i--)
		{
			if ((i - 1) % 4 != 0 || ((i - 1) % 100 == 0 && (i - 1) % 400 != 0))
			{
				day[1] += 365;
			}
			else
			{
				day[1] += 366;
			}
		}
		System.out.print(day[1] - day[0]);
		System.out.print("\n");
		return 0;
	}
}

