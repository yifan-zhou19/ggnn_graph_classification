package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int month;
		int date;
		int all = 0;
		int i;
		int k = 0;
		int t;
		int year;
		int[] p = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date = Integer.parseInt(tempVar3);
		}
		all = ((year % 7 - 1) * (365 % 7) + date-1) % 7;
		if (month == 1)
		{
			;
		}
		else
		{
			for (i = 0;i < month - 1;i++)
			{
			all = all + p[i] % 7;
			}
		}

			k = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
			all = all + k;
			if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month > 2)
			{
			   all = all + 1;
			}
			t = all % 7;
			switch (t)
			{
				case 0:
					System.out.print("Mon.\n");
					break;
				case 1:
					System.out.print("Tue.\n");
					break;
				case 2:
					System.out.print("Wed.\n");
					break;
				case 3:
					System.out.print("Thu.\n");
					break;
				case 4:
					System.out.print("Fri.\n");
					break;
				case 5:
					System.out.print("Sat.\n");
					break;
				case 6:
					System.out.print("Sun.\n");
					break;
			}

		return 0;
	}
}

