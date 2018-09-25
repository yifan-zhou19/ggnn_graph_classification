package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int day;
	int sum;
	int[] a = new int[13];
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
			 if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0))
			 {
			 a[2] = 29;
			 }
			 else
			 {
				 a[2] = 28;
			 }
	sum = day;
	for (int i = 1;i < month;i++)
	{
	sum = sum + a[i];
	}
	System.out.printf("%d",sum);
	System.in.read();
	System.in.read();
	}

}

