package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int res = 0;
		int month;
		int day;
		int i;
		int[] tab = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		res += (year - 1) % 7 + (year - 1) / 4 % 7 - (year - 1) / 100 % 7 + (year - 1) / 400 % 7;
		for (i = 0;i < month - 1;i++)
		{
			res += tab[i];
		}
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month > 2)
		{
			res += 1;
		}
		res += day;
		res = res % 7;
		switch (res)
		{
		case 0:
			System.out.print("Sun.\n");
			break;
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		}
		return 0;
	}
}

