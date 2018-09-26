package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int shousuoya;
		int shuzhangya;
		int hour = 0;
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	  for (i = 1;i <= n;i++)
	  {
	   shousuoya = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   shuzhangya = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (shousuoya >= 90 && shousuoya <= 140 && shuzhangya >= 60 && shuzhangya <= 90)
	   {
		hour += 1;
	   }
	   else
	   {
		if (hour >= c)
		{
		  c = hour;
		  hour = 0;
		}
		else
		{
		 hour = 0;
		}
	   }
	  }
	if (hour >= c)
	{
	   c = hour;
	}
	 System.out.print(c);
	 System.out.print("\n");
	return 0;
	}
}

