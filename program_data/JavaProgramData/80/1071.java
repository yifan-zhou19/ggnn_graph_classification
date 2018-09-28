package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int all = new int(int,int,int);
		int year1;
		int year2;
		int month1;
		int month2;
		int date1;
		int date2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			date2 = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d\n",all(year2, month2, date2) - all(year1, month1, date1));
		return 0;
	}
	public static int all(int year,int month,int date)
	{
		int zong = 0;
		int[] a = new int[3000];
		int[] b = new int[12];
		int i;
		int j;
		int k;
		for (i = 0;i < year - 1;i++)
		{
			if ((i + 1) % 4 == 0 && (i + 1) % 100 != 0 || ((i + 1) % 400 == 0))
			{
				a[i] = 366;
			}
			else
			{
				a[i] = 365;
			}
			zong = zong + a[i];
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
				b[1] = 29;
		}
			else
			{
				b[1] = 28;
			}
		for (j = 0;j < month - 1;j++)
		{
			if ((j + 1) == 1 || (j + 1) == 3 || (j + 1) == 5 || (j + 1) == 7 || (j + 1) == 8 || (j + 1) == 10 || (j + 1) == 12)
			{
				b[j] = 31;
			}
			 if ((j + 1) == 4 || (j + 1) == 6 || (j + 1) == 9 || (j + 1) == 11)
			 {
				b[j] = 30;
			 }
		}
		for (k = 0;k < month - 1;k++)
		{
			zong = zong + b[k];
		}
		zong = zong + date;
		return zong;
	}
}

