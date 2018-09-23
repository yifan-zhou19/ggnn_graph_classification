package <missing>;

public class GlobalMembers
{
	public static int Main()
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
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		int i;





		for (i = 0;i < month;i++)
		{
				sum += a[i - 1];
		}
			sum = sum + day;


		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			if (month <= 2)
			{
				System.out.printf("%d\n",sum);
			}
			if (month > 2)
			{
				sum = sum + 1;
				System.out.printf("%d\n",sum);
			}
		}
		else
		{

			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

