package <missing>;

public class GlobalMembers
{
	// &sup2;&raquo;&frac14;&ordf;&Agrave;&ucirc;&Ecirc;&yacute;�&Ouml;.cpp : Defines the entry point for the console application.
	//
	public static void Main(String[] args)
	{
		int first;
		int i;
		int day = 13;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			first = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11)
			{
				day += 31;
			}
			if (i == 3)
			{
				day += 28;
			}
			if (i == 5 || i == 7 || i == 10 || i == 12)
			{
				day += 30;
			}
			if ((day % 7 - 1 + first) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	}


}

