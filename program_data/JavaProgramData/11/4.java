package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int month;
		int date;
		int n = 0;
		int i;
		int year;
		int p;
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
			date = Integer.parseInt(tempVar3);
		}
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		{
			p = 29;
		}
		else
		{
			p = 28;
		}
		for (i = 1;i < month;i++)
		{
			switch (i)
			{
			case 1:
				n += 31;
				break;
			case 2:
				n += p;
				break;
			case 3:
				n += 31;
				break;
			case 4:
				n += 30;
				break;
			case 5:
				n += 31;
				break;
			case 6:
				n += 30;
				break;
			case 7:
				n += 31;
				break;
			case 8:
				n += 31;
				break;
			case 9:
				n += 30;
				break;
			case 10:
				n += 31;
				break;
			case 11:
				n += 30;
				break;
			}
		}
		n += date;
		System.out.printf("%d\n",n);
		return 0;
	}
}

