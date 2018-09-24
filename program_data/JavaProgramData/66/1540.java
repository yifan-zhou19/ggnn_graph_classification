package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		long year; //???????????????
		long month;
		long day;
		long sum = 0;
		long week;
		year = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		month = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		day = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		int[] nian = {0, 365, 366};
		int[] mon1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????
		int[] mon2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????
		long cycle = year / 400 - 1; //?????????????
		long remain = year - cycle * 400; //??????
		sum += (365 * 400 + 25 * 4 - 3) * cycle; //??????????
		for (int i = 0;i < remain;i++) //?????????????????
		{
			if (i == 0)
			{
				continue;
			}
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) //?????
			{
				sum += nian[2];
			}
			else //??????
			{
				sum += nian[1];
			}
		}

		if ((remain % 4 == 0 && remain % 100 != 0) || remain % 400 == 0) //?????????
		{
			for (int i = 0;i < month;i++)
			{
				sum += mon2[i];
			}
			sum += day;
		}
		else
		{ //??????????
			for (int i = 0;i < month;i++)
			{
				sum += mon1[i];
			}
			sum += day;
		}
		week = sum % 7; //?????
		switch (week)
		{
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
			case 0:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		}
		return 0; //?????
	}
}

