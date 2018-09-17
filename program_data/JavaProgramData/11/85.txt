package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int date;
		int sum = 0;
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
			date = Integer.parseInt(tempVar3);
		}
		int temp;
		if (year % 4 != 0)
		{
			temp = 28; //not
		}
			else if (year % 100 != 0)
			{
				temp = 29; //yes
			}
			else if (year % 400 != 0)
			{
				temp = 28; //not
			}
			else
			{
				temp = 29; //yes
			} //???????
			int[] a = {31, temp, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int i;
			for (i = 0;i < month - 1;i++)
			{
				sum += a[i];
			}
			sum += date;
			System.out.printf("%d",sum);
			return 0;
	}

}

