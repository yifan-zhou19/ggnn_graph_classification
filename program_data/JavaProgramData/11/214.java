package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		int n = 0;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int days[13]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		int i;
		for (i = 0;i < month;i++)
		{
			n = Main_days[i] + n;
		}
		n = day + n;
		if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
		{
			n++;
		}
		System.out.printf("%d\n",n);
	}

}

