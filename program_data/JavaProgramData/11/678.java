package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int m;
		int d;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		for (int i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 2)
			{
					if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
					{
						result += 29;
					}
					else
					{
						result += 28;
					}
			}
				else
				{
					result += 30;
				}
		}
		result += d;
		System.out.printf("%d\n",result);
	}


}

