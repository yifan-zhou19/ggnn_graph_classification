package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int date;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			if (i == 0)
			{
				date = 13;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				date += 30;
			}
			else if (i == 2)
			{
				date += 28;
			}
			else
			{
				date += 31;
			}
			day = (date + x - 1) % 7;
			if (day == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	  return 0;
	}



}

