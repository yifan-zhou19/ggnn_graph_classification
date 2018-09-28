package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int month1;
		int month2;
		int year;
		int i;
		int n;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[] monthday = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int days1 = 0;
			int days2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				monthday[2] = 29;
			}
			for (j = 0;j < month1;j++)
			{
			   days1 = days1 + monthday[j];
			}
			for (j = 0;j < month2;j++)
			{
			   days2 = days2 + monthday[j];
			}
			if (Math.abs(days2 - days1) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			days1 = 0;
			days2 = 0;
		}
		return 0;
	}


}

