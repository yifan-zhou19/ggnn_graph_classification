package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int n;
		int k;
		int m2;
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
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
		  m2 = 29;
		}
		else
		{
			m2 = 28;
		}
		k = m2 + 31;
		switch (month)
		{
		case 1:
			n = day;
			break;
		case 2:
			n = day + 31;
			break;
		case 3:
			n = k + day;
			break;
		case 4:
			n = k + 31 + day;
			break;
		case 5:
			n = 31 + k + 30 + day;
			break;
		case 6:
			n = k + 31 + 30 + 31 + day;
			break;
		case 7:
			n = k + 31 + 30 + 31 + 30 + day;
			break;
		case 8:
			n = k + 31 + 30 + 31 + 30 + 31 + day;
			break;
		case 9:
			n = k + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
		case 10:
			n = k + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
		case 11:
			n = k + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
		case 12:
			n = k + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			break;
		}
		 System.out.printf("%d",n);
	}


}

