package <missing>;

public class GlobalMembers
{
	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int run(int year)
	{
		if (year % 4 != 0)
		{
			return 0;
		}
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{

				if (year % 400 == 0)
				{
					return 1;
				}
				else
				{

				return 0;
				}
			}
			else
			{
				return 1;
			}
		}
	}



	public static int Main()
	{



		int n;
		int i;
		int j;
		int year;
		int date1;
		int date2;
		int tem;
		int[] day = new int[201];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				date1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				date2 = Integer.parseInt(tempVar4);
			}
			month[2] = 28;
			if (run(year) != 0)
			{
				month[2] = 29;
			}
			if (date1 > date2)
			{

				tem = date1;
				date1 = date2;
				date2 = tem;
			}
			for (j = date1;j < date2;j++)
			{
				day[i] += month[j];
			}
		}

		for (i = 1;i < n + 1;i++)
		{

			if (day[i] % 7 == 0)
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

