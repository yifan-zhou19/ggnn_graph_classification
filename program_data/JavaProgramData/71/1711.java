package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
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
				if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static int Main()
	{
	int year;
	int montho;
	int montht;
	int n;
	int i;
	int k;
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
			montho = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			montht = Integer.parseInt(tempVar4);
		}
		k = DiJiTian(year, montht, 1) - DiJiTian(year, montho, 1);
		if (k % 7 == 0)
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

