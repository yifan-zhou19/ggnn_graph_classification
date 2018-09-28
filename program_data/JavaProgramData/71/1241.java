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
		int i;
		for (i = 0;i < n;i++)
		{
			int year;
			int[] month = new int[2];
			int dijitian = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month[1] = Integer.parseInt(tempVar4);
			}
			int ex;
			if (month[0] > month[1])
			{
				ex = month[1];
				month[1] = month[0];
				month[0] = ex;
			}
			for (int k = month[0];k >= month[0] != 0 && k < month[1];k++)
			{
				if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
				{
					dijitian += 31;
				}
				if (k == 4 || k == 6 || k == 9 || k == 11)
				{
					dijitian += 30;
				}
				if (k == 2)
				{
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					{
						dijitian += 29;
					}
					else
					{
						dijitian += 28;
					}
				}
			}
			if (dijitian % 7 == 0)
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

