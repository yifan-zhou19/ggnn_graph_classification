package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		int days;
		int year;
		int month;
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
			days = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < month - 1;i++)
		{
			sum = sum + a[i];
		}
		sum = sum + days;
		if ((month == 2 && days >= 28) || (month > 2))
		{
			 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			 {
				  sum = sum + 1;
			 }
		}
		System.out.printf("%d\n",sum);
		return 0;
	}


}

