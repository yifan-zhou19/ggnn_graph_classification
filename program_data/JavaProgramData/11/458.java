package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int date;
		int a;
		int b;
		int c;
		int e;
		int g;
		int h;
		int j;
		int d;
		int f;
		int i;
		int k;

		a = c = e = g = h = j = 31;
		d = f = i = k = 30;

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

		if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0))
		{
			b = 28;
		}
		else
		{
			b = 29;
		}

		switch (month)
		{
		case 1:
			day = date;
			break;
		case 2:
			day = a + date;
			break;
		case 3:
			day = a + b + date;
			break;
		case 4:
			day = a + b + c + date;
			break;
		case 5:
			day = a + b + c + d + date;
			break;
		case 6:
			day = a + b + c + d + e + date;
			break;
		case 7:
			day = a + b + c + d + e + f + date;
			break;
		case 8:
			day = a + b + c + d + e + f + g + date;
			break;
		case 9:
			day = a + b + c + d + e + f + g + h + date;
			break;
		case 10:
			day = a + b + c + d + e + f + g + h + i + date;
			break;
		case 11:
			day = a + b + c + d + e + f + g + h + i + j + date;
			break;
		case 12:
			day = a + b + c + d + e + f + g + h + i + j + k + date;
			break;
		}

		System.out.printf("%d\n",day);
	}


}

