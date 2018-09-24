package <missing>;

public class GlobalMembers
{
	public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leap = {4, 100, 400};
	public static String[] name = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};

	public static int leapYearBetween(int a,int b)
	{
		int len = b - a + 1;
		int sign = 1;
		int years = 0;
		int temp = 0;

//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
//ORIGINAL LINE: for(int i=0;i<sizeof(leap)/sizeof(int);i++)
		for (int i = 0;i < leap.length;i++)
		{
			temp = len / leap[i];
			if (leap[i] - (leap[i] - a % leap[i]) % leap[i] + len % leap[i] > leap[i])
			{
				temp++;
			}
			years += temp * sign;
			sign *= -1;
		}

		return years;
	}

	public static int Main()
	{
		int y;
		int m;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		int leftDay = leapYearBetween(1, (y - 1) / 7 * 7);
		leftDay += (y - 1) % 7 * 365;
		leftDay += leapYearBetween((y - 1) / 7 * 7 + 1, y - 1);

		for (int i = 0;i < m;i++)
		{
			leftDay += days[i];
		}
		if (m > 2)
		{
			leftDay += leapYearBetween(y, y);
		}
		leftDay += d;

		leftDay %= 7;

		System.out.printf("%s\n",name[leftDay]);

		return 0;
	}
}

