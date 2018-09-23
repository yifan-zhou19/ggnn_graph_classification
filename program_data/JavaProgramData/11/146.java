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
		int[] N = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		for (i = 1;i < month;i++)
		{
			sum = sum + N[i - 1];
		}
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			sum = sum + 1;
		}
		sum = sum + day;
		System.out.printf("%d",sum);

	}
}

