package <missing>;

public class GlobalMembers
{
	/* title:?????*
	 * author:???*
	 * time:2011.10.28*/





	public static int Main()
	{
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] week = new int[13];
		int weekday;
		int i;
		int j;
		weekday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 12; i++)
		{
			for (j = 1; j < i; j++)
			{
				day[i] = day[i] + month[j];
			}
			day[i] = day[i] + 12;
			week[i] = (day[i] % 7 + weekday) % 7;
			if (week[i] == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

