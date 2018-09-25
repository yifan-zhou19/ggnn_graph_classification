package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int year;
		int month1;
		int month2;
		int i;
		int j;
		int t;
		int res;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			res = 0;
			if (month1 > month2)
			{
				t = month1;
				month1 = month2;
				month2 = t;
			}
			for (j = month1;j < month2;j++)
			{
				if (j == 2)
				{
					continue;
				}
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					res = res + 3;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					res = res + 2;
				}
			}
			if (month1 <= 2)
			{
				if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
				{
					res = res;
				}
				else
				{
					res = res + 1;
				}
			}
			if (res % 7 == 0)
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

