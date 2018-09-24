package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int mon;
		int day;
		int i;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0;i < mon;i++)
			{

				total = total + a[i];
			}

		}
	else
	{
				int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				 for (i = 0;i < mon;i++)
				 {

				total = total + a[i];
				 }
	}
			   total += day;
			System.out.printf("%d",total);

	}


}

