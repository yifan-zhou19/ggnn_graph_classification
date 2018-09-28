package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int day;
		int k;
		int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}

	for (i = 1;i <= 12;i++)
	{
	 day = 0;
	 for (k = 1;k < i;k++)
	 {
	  if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
	  {
		 day += 31;
	  }
	   else if (k == 4 || k == 6 || k == 9 || k == 11)
	   {
		 day += 30;
	   }
	   else if (k == 2)
	   {
		   day += 28;
	   }
	 }
	  day += 13;
	   t = w + (day - 1) % 7;
	   if (t > 7)
	   {
		   t = t - 7;
	   }
	   if (t == 5)
	   {
		 System.out.printf("%d\n",i);
	   }
	}
	return 0;
	}
}

