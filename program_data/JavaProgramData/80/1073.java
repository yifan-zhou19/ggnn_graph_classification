package <missing>;

public class GlobalMembers
{
	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????
	public static int startYear;
	public static int startMonth;
	public static int startDay;
	public static int endYear;
	public static int endMonth;
	public static int endDay;
	public static void Main()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startYear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}

		int f = int; //f????????h????????g?????365??????????
		int h1 = int;
		int h2 = int;
		int g = new int(int, int);
		int i; //sum?startYear?endYear??????(??????)
		int sum = 0;
		int result;

		if (startYear != endYear)
		{
			for (i = startYear + 1; i < endYear; i++)
			{
				if (f(i) == 1)
				{
					sum = sum + 1;
				}
			}
			//printf("%d\n",sum); 
			//printf("%d\n",g(startMonth, startDay)); 
			//printf("%d\n",(f(startYear) && h1(startMonth))); 
			//printf("%d\n",g(endMonth, endDay)); 
			//printf("%d\n",(f(endYear) && h2(endMonth))); 
			result = 365 - g(startMonth, startDay) + (f(startYear) != 0 && h1(startMonth) != 0) + (endYear - startYear - 1) * 365 + sum + g(endMonth, endDay) + (f(endYear) != 0 && h2(endMonth) != 0);
		}
		else
		{
			result = g(endMonth, endDay) - g(startMonth, startDay) + (f(startYear) != 0 && h1(startMonth) != 0 && h2(endMonth) != 0);
		};
		System.out.printf("%d", result);
	}
	public static int f(int year) //????
	{
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)); //1????0????
	}
	public static int h1(int mon) //????1
	{
		return (mon <= 2);
	}
	public static int h2(int mont) //????2
	{
		return (mont > 2);
	}
	public static int g(int m, int d)
	{
		int i;
		int fromto = 0;
		for (i = 1; i < m; i++)
		{
			fromto = fromto + month[i];
		//	if (f(startYear) && (m == 2)) fromto++; 
		}
		return (fromto + d);
	}

}

