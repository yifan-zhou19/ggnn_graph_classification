package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
	int ss;
	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	{
	ss = 1;
	}
	else
	{
	ss = 0;
	}
	return ss;
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int e;
		int n;
		int k;
		int i;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			result = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (b > c)
			{
				e = b;
				b = c;
				c = e;
			}
			for (int i = b;i < c;i++)
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
					if (isRunNian(a) != 0)
					{
						result += 29;
					}
					else
					{
						result += 28;
					}
				}
			}
			if (result % 7 == 0)
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

