package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int month;
		int day;
		int i;
		int num = 0;
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
		if (year % 4 == 0)
		{
		   if (year % 100 == 0 && year % 400 != 0)
		   {
			  a[2] = 28;
		   }
		   else if (year % 400 == 0)
		   {
			  a[2] = 29;
		   }
		   else
		   {
			   a[2] = 29;
		   }
		}
		else
		{
			a[2] = 28;
		}
		for (i = 1;i < month;i++)
		{
		   num = num + a[i];
		}
		num = num + day;
		System.out.printf("%d",num);
		return 0;
	}
}

