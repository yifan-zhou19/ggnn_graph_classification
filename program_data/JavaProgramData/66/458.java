package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mouth;
		int day;
		int k;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mouth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		sum = (year - 1) % 7 + year / 4 - year / 100 + year / 400;
				for (k = 1;k < mouth;k++)
				{
					if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
					{
						sum += 3;
					}
						if (k == 4 || k == 6 || k == 9 || k == 11)
						{
							sum += 2;
						}
				}
					if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && (mouth <= 2))
					{
						sum--;
					}
				sum += day;
				if (sum % 7 == 0)
				{
					System.out.print("Sun.");
				}
				if (sum % 7 == 1)
				{
					System.out.print("Mon.");
				}
				if (sum % 7 == 2)
				{
					System.out.print("Tue.");
				}
				if (sum % 7 == 3)
				{
					System.out.print("Wed.");
				}
				if (sum % 7 == 4)
				{
					System.out.print("Thu.");
				}
				if (sum % 7 == 5)
				{
					System.out.print("Fri.");
				}
				if (sum % 7 == 6)
				{
					System.out.print("Sat.");
				}
	return 0;
	}


}

