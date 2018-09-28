package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int year;
		int month1;
		int month2;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n; j++)
		{
			int total1 = 0;
			int total2 = 0;
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
				 for (i = 1; i < month1; i++)
				 {
					 if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					 {
						 total1 = total1 + 31;
					 }
					 if (i == 4 || i == 6 || i == 9 || i == 11)
					 {
						 total1 = total1 + 30;
					 }
					if (i == 2)
					{
						 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
						 {
							total1 = total1 + 29;
						 }
						 else
						 {
						   total1 = total1 + 28;
						 }
					}
				 }
				 for (m = 1; m < month2; m++)
				 {
					 if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
					 {
						 total2 = total2 + 31;
					 }
					 if (m == 4 || m == 6 || m == 9 || m == 11)
					 {
						 total2 = total2 + 30;
					 }
					 if (m == 2)
					 {
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
						{
							 total2 = total2 + 29;
						}
						else
						{
							 total2 = total2 + 28;
						}
					 }
				 }
				 y = total1 - total2;
				 if (y % 7 == 0)
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

