package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
		{
		   result = 1;
		}
		else
		{
		   result = 0;
		}
		return result;
	}
	public static int DijiTian(int year,int month,int day)
	{
		int result = 0;
		for (int i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		 int e;
		 e = a.argValue;
		 a.argValue = b.argValue;
		 b.argValue = e;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int DijiTian(int year, int month, int day);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int isRunNian(int year);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void swap(tangible.RefObject<int> a, tangible.RefObject<int> b);
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int a;
		int i;
		int[] sz = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if (month1 > month2)
			{
			tangible.RefObject<Integer> tempRef_month1 = new tangible.RefObject<Integer>(month1);
			tangible.RefObject<Integer> tempRef_month2 = new tangible.RefObject<Integer>(month2);
				swap(tempRef_month1, tempRef_month2);
				month2 = tempRef_month2.argValue;
				month1 = tempRef_month1.argValue;
			}
			a = DijiTian(year, month2, 1) - DijiTian(year, month1, 1);
			if (a % 7 == 0)
			{
			   System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

