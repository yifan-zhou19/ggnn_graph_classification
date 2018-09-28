package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] ping = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] run = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};

		int year;
		int mon;
		int day;
		int result = 0;

		//printf("%d\n",(1*366+3*365)%7);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		int temp = year;
		year = year - 1;

		result += (year / 400) * FOURFUN;
		year = year % 400;

		result += (year / 100) * ONEFUN;
		year = year % 100;

		result += (year / 20) * TWEN;
		year = year % 20;

		result += (year / 4) * FOUR;
		year = year % 4;

		result += ONE * year;

		int flag = 0;

		if (temp % 400 == 0)
		{
			flag = 1;
		}
		else if (temp % 100 != 0 && temp % 4 == 0)
		{
			flag = 1;
		}

		if (flag == 1)
		{
			int i;
			for (i = 0;i < mon - 1;i++)
			{
				result += run[i];
			}
			result += day;
		}
		else
		{
			int i;
			for (i = 0;i < mon - 1;i++)
			{
				result += ping[i];
			}
			result += day;
		}
		result = result % 7;

		System.out.printf("%s\n",week[result]);
	}
}

