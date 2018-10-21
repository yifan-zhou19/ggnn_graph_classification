package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int i;
		int temp;
		int n = 0;
		int[] A = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] B = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		temp = year1;
		while (temp != year2)
		{
			if ((temp % 4 == 0 && temp % 100 != 0) || (temp % 400 == 0))
			{
				n = n + 366;
			}
			else
			{
				n = n + 365;
			}
			temp += 1;
		}
		temp = 0;
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			for (i = 0;i < month1 - 1;i++)
			{
				temp = temp + B[i];
			}
			temp = temp + day1;
		}
		else
		{
			for (i = 0;i < month1 - 1;i++)
			{
				temp = temp + A[i];
			}
			temp = temp + day1;
		}
		n = n - temp;
		temp = 0;
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			for (i = 0;i < month2 - 1;i++)
			{
				temp = temp + B[i];
			}
			temp = temp + day2;
		}
		else
		{
			for (i = 0;i < month2 - 1;i++)
			{
				temp = temp + A[i];
			}
			temp = temp + day2;
		}
		n = n + temp;
		System.out.printf("%ld\n", n);
		return 0;
	}
}

