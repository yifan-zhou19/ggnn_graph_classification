package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int sum;
		int i;
		int[] a = new int[12];
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
		sum = 0;
		a[0] = a[2] = a[4] = a[6] = a[7] = a[9] = a[11] = 31;
		a[3] = a[5] = a[8] = a[10] = 30;
		if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0)))
		{
			a[1] = 28;
		}
		else
		{
			a[1] = 29;
		}
		for (i = 0;i < month - 1;i++)
		{
			sum += a[i];
		}
		sum = sum + day;
		System.out.printf("%d\n",sum);
		return 0;
	}

}

