package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int total = 0;
		int year;
		int month;
		int day;
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
			for (j = 1;j < month;j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					total = total + 31;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					total = total + 30;
				}
				if (j == 2)
				{
					if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					{
						total = total + 29;
					}
					else
					{
						total = total + 28;
					}
				}
			}
				total = total + day;
				System.out.printf("%d\n",total);
				return 0;

	}
}

