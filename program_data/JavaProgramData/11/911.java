package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int leap;
		int sum = 0;
		int[] a = new int[12];
		int i;
		int j;
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
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			leap = 1;
		}
		else
		{
			leap = 0;
		}
		a[0] = 31;
		a[2] = 31;
		a[3] = 30;
		a[4] = 31;
		a[5] = 30;
		a[6] = 31;
		a[7] = 31;
		a[8] = 30;
		a[9] = 31;
		a[10] = 30;
		a[11] = 31;
		if (leap == 1)
		{
			a[1] = 29;
		}
		else
		{
			a[1] = 28;
		}
		for (i = 0;i < 12;i++)
		{
			if (month == i + 1)
			{
				for (j = 0;j < i;j++)
				{
					sum += a[j];
				}
				sum += day;
				break;
			}
		}
		System.out.printf("%d",sum);
		System.in.read();
		System.in.read();
	}

}

