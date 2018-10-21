package <missing>;

public class GlobalMembers
{
	public static int Jisuan(int year,int month,int day)
	{
		int Calnumber;
		Calnumber = year * 365;
		int i;
		int j = 0;
		for (i = 1;i < year;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				j++;
			}
		}
		Calnumber = Calnumber + j;
		int daysinFeb;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			daysinFeb = 29;
		}
		else
		{
			daysinFeb = 28;
		}
		switch (month)
		{
		case 1:
			Calnumber += 0;
			break;
		case 2:
			Calnumber += 31;
			break;
		case 3:
			Calnumber += 31 + daysinFeb;
			break;
		case 4:
			Calnumber += 31 + 31 + daysinFeb;
			break;
		case 5:
			Calnumber += 31 + 31 + 30 + daysinFeb;
			break;
		case 6:
			Calnumber += 31 + 31 + 30 + 31 + daysinFeb;
			break;
		case 7:
			Calnumber += 31 + 31 + 31 + 30 + 30 + daysinFeb;
			break;
		case 8:
			Calnumber += 31 + 31 + 31 + 31 + 30 + 30 + daysinFeb;
			break;
		case 9:
			Calnumber += 31 + 31 + 31 + 31 + 31 + 30 + 30 + daysinFeb;
			break;
		case 10:
			Calnumber += 31 + 31 + 31 + 31 + 31 + 30 + 30 + 30 + daysinFeb;
			break;
		case 11:
			Calnumber += 31 + 31 + 3 + 31 + 31 + 31 + 30 + 30 + 30 + daysinFeb;
			break;
		case 12:
			Calnumber += 365 - 28 - 31 + daysinFeb;
			break;
		}
		Calnumber += day;
		return (Calnumber);
	}
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		int Cal1;
		int Cal2;
		Cal1 = Jisuan(y1, m1, d1);
		Cal2 = Jisuan(y2, m2, d2);
		int Con;
		Con = Cal2 - Cal1;
		System.out.printf("%d",Con);
		return 0;
	}

}

