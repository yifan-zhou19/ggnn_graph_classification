package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int year;
		int month1;
		int month2;
		int i;
		int j;
		int sum;
		int begin;
		int end;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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


			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				days[2] = 29;
			}
			else
			{
				days[2] = 28;
			}


			if (month1 > month2)
			{
				begin = month2;
				end = month1;
			}
			else
			{
				begin = month1;
				end = month2;
			}



			sum = 0;
			for (j = begin;j < end;j++)
			{
				sum = sum + days[j];
			}



			if (sum % 7 == 0)
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

