package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int a;
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int sum = 0;
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
		if (year % 4 == 0 && year % 100 != 0)
		{
			a = 1;
		}
		else if (year % 100 == 0 && year % 400 == 0)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		if (a == 1)
		{
			m[1] = 29;
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + m[i];
			}
			sum = sum + day;
		}
		else if (a == 0)
		{
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + m[i];
			}
			sum = sum + day;
		}
		System.out.printf("%d\n", sum);
	}


}

