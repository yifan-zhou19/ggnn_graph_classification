package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int leap_or_not = int year;
		int daysnotleap = int month;
		int daysleap = int month;
		int[][] data = new int[201][3];
		int i;
		int j;
		int[] sum = new int[201];
		int num;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					data[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= num;i++)
		{
			if (data[i][1] > data[i][2])
			{
					temp = data[i][1];
					data[i][1] = data[i][2];
					data[i][2] = temp;
			}
		}
		for (i = 1;i <= num;i++)
		{
			if (leap_or_not(data[i][0]) == 0)
			{
			for (j = data[i][1];j < data[i][2];j++)
			{
				sum[i] += daysnotleap(j);
			}
			}
			else
			{
				for (j = data[i][1];j < data[i][2];j++)
				{
					sum[i] += daysleap(j);
				}
			}
		}
		for (i = 1;i <= num;i++)
		{
			if (sum[i] % 7 == 0)
			{
				System.out.print("YES\n");
			}
		else
		{
			System.out.print("NO\n");
		}
		}
	}

	public static int leap_or_not(int year)
	{
		 int leap;
		 if (year % 4 == 0)
		 {
			 if (year % 100 == 0)
			 {
				 if (year % 400 == 0)
				 {
					 leap = 1;
				 }
				 else
				 {
					 leap = 0;
				 }
			 }
			 else
			 {
				 leap = 1;
			 }
		 }
		 else
		 {
			 leap = 0;
		 }
		return leap;
	}

	public static int daysnotleap(int month)
	{
		int day;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			day = 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			day = 30;
		}
		else
		{
			day = 28;
		}
		return (day);
	}
	public static int daysleap(int month)
	{
		int day;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			day = 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			day = 30;
		}
		else
		{
			day = 29;
		}
		return (day);
	}
}

