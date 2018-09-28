package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int y;
		int m1;
		int m2;
		int total1 = 0;
		int total2 = 0;
		int i = 1;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			total1 = 0;
			total2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			for (i = 1; i < m1; i++)
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
				if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
				{
					  total1 = total1 + 29;
				}
				else
				{
					total1 = total1 + 28;
				}
			 }
			}
		total1 = total1 + 1;
		for (i = 1; i < m2; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
					total2 = total2 + 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
					total2 = total2 + 30;
			}
			 if (i == 2)
			 {
				if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
				{
					  total2 = total2 + 29;
				}
				else
				{
					total2 = total2 + 28;
				}
			 }
		}
		total2 = total2 + 1;

		if ((total1 - total2) % 7 == 0)
		{
			System.out.print("YES\n");
			continue;
		}
		else
		{
			System.out.print("NO\n");
			continue;
		}

		}

	}

}

