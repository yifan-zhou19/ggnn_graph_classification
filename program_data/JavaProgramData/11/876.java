package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mon;
		int day;
		int num = 0;
		int i;
		int[] a = new int[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		a[0] = a[2] = a[4] = a[6] = a[7] = a[9] = 31;
		a[3] = a[5] = a[8] = a[10] = 30;
		if (year % 4 != 0)
		{
			a[1] = 28;
		}
		else if (year % 100 == 0)
		{
			if (year % 400 == 0)
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
		}
		else
		{
			a[1] = 29;
		}
		for (i = 0;i < mon - 1;i++)
		{
			num = num + a[i];
		}
		num = num + day;
		System.out.printf("%d",num);
		return 0;
	}

}

