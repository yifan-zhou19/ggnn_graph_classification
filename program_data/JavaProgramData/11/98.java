package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int n;
		int mday = 0;
		int i = 1;
		int[] p = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		for (i = 1;i < month + 1;i++)
		{
				mday = mday + p[i - 1];
		}
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			if (month >= 3)
			{
				mday = mday + 1;
			}
			else
			{
				mday = mday;
			}
		}
		n = mday + day;
		System.out.printf("%d",n);
	}

}

