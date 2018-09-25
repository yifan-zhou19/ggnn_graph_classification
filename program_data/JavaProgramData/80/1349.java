package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int days = 0;
		int flag = 0; //flag?????????
		int i;
		int j;
		year[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] leap_year =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		}; //?????????????
		for (i = year[0] + 1;i < year[1];i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				days += 366;
			}
			else
			{
				days += 365;
			}
		} //????????
		if (year[0] != year[1]) //??????????????????????????????
		{
			for (i = month[0];i < 12;i++)
			{
				if ((year[0] % 4 == 0 && year[0] % 100 != 0) || (year[0] % 400 == 0))
				{
					days += leap_year[1][i];
					flag = 1;
				}
				else
				{
					days += leap_year[0][i];
				}
			} //?????????????
			for (i = 0;i < month[1] - 1;i++)
			{
				if ((year[1] % 4 == 0 && year[1] % 100 != 0) || (year[1] % 400 == 0))
				{
					days += leap_year[1][i];
				}
				else
				{
					days += leap_year[0][i];
				}
			} //??????????
			days = days + day[1] + leap_year[flag][month[0] - 1] - day[0]; //????????????????
		}
		else if (month[0] != month[1]) //???????????????????????????
		{
			for (i = month[0];i < month[1] - 1;i++)
			{
				if ((year[0] % 4 == 0 && year[0] % 100 != 0) || (year[0] % 400 == 0))
				{
					days += leap_year[1][i];
					flag = 1;
				}
				else
				{
					days += leap_year[0][i];
				}
			}
			days = days + day[1] + leap_year[flag][month[0] - 1] - day[0]; //??????????????????
		}
		else
		{
			days = days + day[1] - day[0]; //??????????????????????????
		}
		System.out.print(days);
		System.out.print("\n");
		return 0;
	}

}

