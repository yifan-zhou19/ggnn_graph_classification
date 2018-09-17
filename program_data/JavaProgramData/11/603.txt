package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int num;
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
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			if (month == 1)
			{
				num = day;
				System.out.printf("%d\n",num);
			}
			if (month == 2)
			{
				num = day + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 3)
			{
				num = day + 31 + 29;
				System.out.printf("%d\n",num);
			}
			if (month == 4)
			{
				num = day + 31 + 29 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 5)
			{
				num = day + 31 + 29 + 31 + 30;
				System.out.printf("%d\n",num);
			}
			if (month == 6)
			{
				num = day + 31 + 29 + 31 + 30 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 7)
			{
				num = day + 31 + 29 + 31 + 30 + 31 + 30;
				System.out.printf("%d\n",num);
			}
			if (month == 8)
			{
				num = day + 31 + 29 + 31 + 30 + 31 + 30 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 9)
			{
				num = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 10)
			{
				num = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				System.out.printf("%d\n",num);
			}
			if (month == 11)
			{
				num = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 12)
			{
				num = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				System.out.printf("%d\n",num);
			}
		}
		else
		{
			if (month == 1)
			{
				num = day;
				System.out.printf("%d\n",num);
			}
			if (month == 2)
			{
				num = day + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 3)
			{
				num = day + 31 + 28;
				System.out.printf("%d\n",num);
			}
			if (month == 4)
			{
				num = day + 31 + 28 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 5)
			{
				num = day + 31 + 28 + 31 + 30;
				System.out.printf("%d\n",num);
			}
			if (month == 6)
			{
				num = day + 31 + 28 + 31 + 30 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 7)
			{
				num = day + 31 + 28 + 31 + 30 + 31 + 30;
				System.out.printf("%d\n",num);
			}
			if (month == 8)
			{
				num = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 9)
			{
				num = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 10)
			{
				num = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				System.out.printf("%d\n",num);
			}
			if (month == 11)
			{
				num = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				System.out.printf("%d\n",num);
			}
			if (month == 12)
			{
				num = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				System.out.printf("%d\n",num);
			}
		}
		return 0;
	}
}

