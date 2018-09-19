package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int sum = 0;
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
		switch (month)
		{
			case 1:
				sum = day;
				break;
			case 2:
				sum = 31 + day;
				break;
			case 3:
				sum = 31 + 28 + day;
				break;
			case 4:
				sum = 31 + 28 + 31 + day;
				break;
			case 5:
				sum = 31 + 28 + 31 + 30 + day;
				break;
			case 6:
				sum = 31 + 28 + 31 + 30 + 31 + day;
				break;
			case 7:
				sum = 31 + 28 + 31 + 30 + 31 + 30 + day;
				break;
			case 8:
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
				break;
			case 9:
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				break;
			case 10:
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				break;
			case 11:
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				break;
			case 12:
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + day;
				break;
		}
		if (month > 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
		{
			sum = sum + 1;
		}
		System.out.printf("%d",sum);
	}
}

