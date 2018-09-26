package <missing>;

public class GlobalMembers
{
	public static int isRun(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main(String[] args)
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;

		int startOffset = 0; ///??????????startyear 1-1
		int endOffset = 0;
		int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startYear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}

		if (isRun(startYear) != 0)
		{
			if (startMonth > 2)
			{
				for (i = 0; i < startMonth - 1; i++)
				{
					startOffset += Month[i];
				}
				startOffset += 1;
				startOffset += startDay - 1;
			}
			else
			{
				for (i = 0; i < startMonth - 1; i++)
				{
					startOffset += Month[i];
				}
				startOffset += startDay - 1;
			}
		}
		else
		{
			for (i = 0; i < startMonth - 1; i++)
			{
				startOffset += Month[i];
			}
			startOffset += startDay - 1;
		}
		//////////////////////////////////////////////////////////////////////////

		for (j = startYear; j < endYear; j++)
		{
			if (isRun(j) != 0)
			{
				endOffset += 366;
			}
			else
			{
				endOffset += 365;
			}
		}

		if (isRun(endYear) != 0)
		{
			if (endMonth > 2)
			{
				for (i = 0; i < endMonth - 1; i++)
				{
					endOffset += Month[i];
				}
				endOffset += 1;
				endOffset += endDay - 1;
			}
			else
			{
				for (i = 0; i < endMonth - 1; i++)
				{
					endOffset += Month[i];
				}
				endOffset += endDay - 1;
			}
		}
		else
		{
			for (i = 0; i < endMonth - 1; i++)
			{
				endOffset += Month[i];
			}
			endOffset += endDay - 1;
		}

		if (endOffset >= startOffset)
		{
			System.out.printf("%d",(endOffset - startOffset));
		}

	}
}

