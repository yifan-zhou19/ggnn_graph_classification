package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int day;
		int mon;
		int cal = int mon;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (mon = 1;mon < 13;mon++)
		{
			day = cal(mon);
			if ((day + w) % 7 == 5)
			{
				System.out.printf("%d\n",mon);
			}
		}
	}
	public static int cal(int mon)
	{
	   int total = 0;
	   if (mon > 1)
	   {
		   total += 31;
	   }
	   if (mon > 2)
	   {
		   total += 28;
	   }
	   if (mon > 3)
	   {
		   total += 31;
	   }
	   if (mon > 4)
	   {
		   total += 30;
	   }
	   if (mon > 5)
	   {
		   total += 31;
	   }
	   if (mon > 6)
	   {
		   total += 30;
	   }
	   if (mon > 7)
	   {
		   total += 31;
	   }
	   if (mon > 8)
	   {
		   total += 31;
	   }
	   if (mon > 9)
	   {
		   total += 30;
	   }
	   if (mon > 10)
	   {
		   total += 31;
	   }
	   if (mon > 11)
	   {
		   total += 30;
	   }
	   total = total + 12;
	   return (total);
	}
}

