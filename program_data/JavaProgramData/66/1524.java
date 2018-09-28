package <missing>;

public class GlobalMembers
{
	public static int doublemonth(int n)
	{
		if ((!(n % 4)) && (n % 100))
		{
			return 1;
		}
		else if (!(n % 400))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int whichmonth(int n, int m)
	{
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int day;
		day = 0;
		for (i = 0;i < n;i++)
		{
						if (m != 0)
						{
							day = day + month[i];
						}
						else
						{
							 if (i == 1)
							 {
								 day = day + month[i] + 1;
							 }
							 else
							 {
								 day = day + month[i];
							 }
						}
		}
		return day;
	}
	public static int Main()
	{
		int m;
		int n;
		int p;
		int q;
		int day;
		String[] weekday = {"Sun.", "Mon.", "Tue.", "Wen.", "Thu.", "Fri.", "Sat."};
		day = 0;
		//printf("?????????????????????????????????\n");
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		if (doublemonth(n) != 0)
		{
					 m = (n % 7 + n / 4 - n / 100 + n / 400 - 1) % 7; //???7????2??1
					 day = whichmonth(q - 1, 0) + p - 1;
		}
		else
		{
			 m = (n % 7 + n / 4 - n / 100 + n / 400) % 7;
			 day = whichmonth(q - 1, 1) + p - 1;
		}
		day = (day + m) % 7;
		System.out.printf("%s\n",weekday[day]);
		return 0;
	}

}

