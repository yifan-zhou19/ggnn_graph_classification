package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int yy;
		int mm;
		int dd;
		int m = 0;
		int days = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			dd = Integer.parseInt(tempVar3);
		}
		do
		{
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			{
				days = days + 31;
			}
			else if (m == 4 || m == 6 || m == 9 || m == 11)
			{
				days = days + 30;
			}
			else if ((((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0)) && m == 2)
			{
				days = days + 29;
			}
			else if ((yy % 4 != 0 || yy % 100 == 0) && m == 2)
			{
				days = days + 28;
			}
			m++;
		}while (m < mm);
		days = days + dd;
		System.out.printf("%d\n",days);
		return 0;
	}
}

