package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int Main()
	{
		int M;
		int m;
		int n;
		int p;
		int i;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		if (M < 401)
		{
			m = M;
		}
		else
		{
				for (i = M;i > 0;i -= 400)
				{
					m = i;
				}
		}
		for (i = 1;i < m;i++)
		{
		   if (isRunNian(i) != 0)
		   {
			  result += 366;
		   }
		   else
		   {
			  result += 365;
		   }
		}
		for (i = 1;i < n;i++)
		{
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		   {
				result += 31;
		   }
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(m) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += p;
		int q;
		q = result % 7;
		if (q == 0)
		{
			System.out.print("Sun.");
		}
		if (q == 1)
		{
			System.out.print("Mon.");
		}
		if (q == 2)
		{
			System.out.print("Tue.");
		}
		if (q == 3)
		{
			System.out.print("Wed.");
		}
		if (q == 4)
		{
			System.out.print("Thu.");
		}
		if (q == 5)
		{
			System.out.print("Fri.");
		}
		if (q == 6)
		{
			System.out.print("Sat.");
		}
	return 0;
	}


}

