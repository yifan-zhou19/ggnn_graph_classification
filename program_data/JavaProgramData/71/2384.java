package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int mon)
	{
		int result = 0;
		int i;
		for (i = 1;i < mon;i++)
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
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += 1;
		return result;
	}
	public static int Main()
	{
	int i;
	int n;
	int mon1;
	int mon2;
	int year;
	int result;
	int[] sz = new int[200];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
	   sz[i] = 0;
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
			mon1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			mon2 = Integer.parseInt(tempVar4);
		}
		result = DiJiTian(year, mon1) - DiJiTian(year, mon2);
		if (result < 0)
		{
			result = 0 - result;
		}
		if ((result % 7) == 0)
		{
		sz[i] = 1;
		}
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (sz[i] == 1)
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

