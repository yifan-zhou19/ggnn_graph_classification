package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int result = 0;
		int i;
		int[] yue = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
			day = Integer.parseInt(tempVar3);
		}

		if ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0 && year % 4 == 0)
		{
			yue[1] = 29;
		}

		if (month == 1)
		{
			result = result + day;
			System.out.printf("%d",result);

		}
		if (month > 1)
		{
			for (i = 0;i < month - 1;i++)
			{
				result = result + yue[i];
			}
			result = result + day;
			System.out.printf("%d\n",result);

		}






	}
}

