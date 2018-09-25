package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int x;
		int a2;
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
		if (year % 4 == 0 && year % 100 != 0)
		{
			a2 = 29;
		}
		else
		{
			a2 = 28;
		}

		switch (month)
		{
		case 1:
			x = day;
			System.out.printf("%d",x);
			break;
		case 2:
			x = a1 + day;
			System.out.printf("%d",x);
			break;
		case 3:
			x = a1 + a2 + day;
			System.out.printf("%d",x);
			break;
		case 4:
			System.out.printf("%d",x);
			x = a1 + a2 + a3 + day;
			break;
		case 5:
			x = a1 + a2 + a3 + a4 + day;
			System.out.printf("%d",x);
			break;
		case 6:
			x = a1 + a2 + a3 + a4 + a5 + day;
			System.out.printf("%d",x);
			break;
		case 7:
			x = a1 + a2 + a3 + a4 + a5 + a6 + day;
			System.out.printf("%d",x);
			break;
		case 8:
			x = a1 + a2 + a3 + a4 + a5 + a6 + a7 + day;
			System.out.printf("%d",x);
			break;
		case 9:
			x = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + day;
			System.out.printf("%d",x);
			break;
		case 10:
			x = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + day;
			System.out.printf("%d",x);
			break;
		case 11:
			x = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + day;
			System.out.printf("%d",x);
			break;
		case 12:
			x = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + day;
			System.out.printf("%d",x);
			break;
		}

		return 0;
	}
}

