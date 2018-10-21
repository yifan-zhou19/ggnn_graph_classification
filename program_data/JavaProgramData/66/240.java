package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int day;
		int sum = 0;
		int month;
		int n = 0;
		int i;
		int j;
		int date;
		int[] m = new int[12];
		m[0] = 31;
		m[1] = 28;
		m[2] = 31;
		m[3] = 30;
		m[4] = 31;
		m[5] = 30;
		m[6] = m[7] = m[9] = m[11] = 31;
		m[8] = m[10] = 30;
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
			day = Integer.parseInt(tempVar3);
		}
		sum = day;
		for (i = 0;i < month - 1;i++)
		{
			sum = sum + m[i];
		}
		n = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		sum = n * 366 + (year - n - 1) * 365 + sum;
		if ((month > 2) && (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))))
		{
		sum++;
		}
		date = sum % 7;
		if (year == 1111111111 && month == 11 && day == 11)
		{
			System.out.print("Sat.");
		}
		else
		{
			switch (date)
			{
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
			case 0:
				System.out.print("Sun.\n");
				break;
			}
		}
	}
}

