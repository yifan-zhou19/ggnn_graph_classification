package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
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
		int j = 1;
		int s = year % 400;
		int mday = 0;
		for (j = 0;j < s;j++)
		{
			if ((j % 4 == 0 && j % 100 != 0) || j % 400 == 0)
			{
				mday = mday + 366;
			}
			else
			{
				mday = mday + 365;
			}
		}
		int[] p = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i = 1;
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
		int n;
		n = mday + day;
		int m;
		m = n % 7;
		switch (m)
		{
		case 1:
			System.out.print("Sat.");
			break;

		 case 2:
			 System.out.print("Sun.");
			 break;
		 case 3:
			 System.out.print("Mon.");
			 break;
		 case 4:
			 System.out.print("Tue.");
			 break;
		 case 5:
			 System.out.print("Wed.");
			 break;
		 case 6:
			 System.out.print("Thu.");
			 break;
		 default:
			 System.out.print("Fri.");
		}
	}



}

