package <missing>;

public class GlobalMembers
{
	public static int isRN(int year)
	{
		int result;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static void Main()
	{
		int n;
		int m1;
		int m2;
		int year;
		int i;
		int k;
		int e;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				e = m1;
				m1 = m2;
				m2 = e;
			}
			for (k = m1;k < m2;k++)
			{
				if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
				{
					sum += 31;
				}
				else if (k == 4 || k == 6 || k == 9 || k == 11)
				{
					sum += 30;
				}
				else
				{
					if (isRN(year) == 1)
					{
						sum += 29;
					}
					else
					{
						sum += 28;
					}
				}
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
	}



}

