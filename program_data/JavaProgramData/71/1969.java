package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int year;
		int m1;
		int m2;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
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
			if (m1 > m2)
			{
				k = m1;
				m1 = m2;
				m2 = k;
			}
			total = 0;
		for (j = m1;j < m2; j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				total += 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				total += 30;
			}
			else if (j == 2)
			{
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}

		if (total % 7 == 0)
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

