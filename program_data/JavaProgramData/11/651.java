package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int sum = 0;
	   int year;
	   int month;
	   int day;
	   int[] a = new int[32];
	   int i;
	   int n;
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
	   a[0] = 0;
	   a[1] = 31;
	   a[3] = 31;
	   a[4] = 30;
	   a[5] = 31;
	   a[6] = 30;
	   a[7] = 31;
	   a[8] = 31;
	   a[9] = 30;
	   a[10] = 31;
	   a[11] = 30;
	   a[12] = 31;
		if (year % 4 == 0 && year % 200 == 0)
		{
			a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		for (i = 0;i < month;i++)
		{
			sum = sum + a[i];
		}
		n = sum + day;
		System.out.printf("%d",n);
		return 0;
	}
}

