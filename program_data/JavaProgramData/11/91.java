package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int total;
		int i;
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
		int[] monday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		total = 0;
		for (i = 1;i < month;i++)
		{
			total = total + monday[i - 1];
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			total = total + 1;
		}
		total = total + day;
		System.out.printf("%d",total);
	}
}

