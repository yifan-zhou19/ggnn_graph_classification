package <missing>;

public class GlobalMembers
{
	public static int dijitian(int y, int m, int d)
	{
		int sum = 0;
		int i;
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
			}
			else if (i != 2)
			{
				sum += 30;
			}
			else
			{
				if ((y % 400 == 0) || (y % 100 != 0 && y % 4 == 0))
				{
				   sum += 29;
				}
				else
				{
				   sum += 28;
				}
			}
		}
		sum += d;
		return sum;
	}
	public static int Main()
	{
		int n;
		int k;
		int year;
		int month1;
		int month2;
		int cha;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   year = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   month1 = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   month2 = Integer.parseInt(tempVar4);
		   }
		   cha = dijitian(year, month1, 1) - dijitian(year, month2, 1);
		   if (cha < 0)
		   {
			  cha = -cha;
		   }
		   if (cha % 7 == 0)
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

