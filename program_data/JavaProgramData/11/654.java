package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int sum = 0;
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
		int[][] a =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			for (i = 0;i < month;i++)
			{
				sum += a[1][i];
			}
			sum = sum + day - a[1][month - 1];
		}
		else
		{
			for (i = 0;i < month;i++)
			{
				sum += a[0][i];
			}
			sum = sum + day - a[0][month - 1];
		}
		System.out.printf("%d", sum);
		return 0;
	}
}

