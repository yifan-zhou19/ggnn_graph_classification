package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int[] firstday = new int[13];
		int i;

		firstday[1] = 1;
		for (i = 2; i <= 12; i++)
		{
			  firstday[i] = firstday[i - 1] + days[i - 1];
		}

		int[] day13 = new int[13];
		for (i = 1; i <= 12; i++)
		{
			  day13[i] = firstday[i] + 12;
		}

		int[] week = new int[13];
		 for (i = 1; i <= 12; i++)
		 {
			  week[i] = (day13[i] - 1 + w) % 7;
			  if (week[i] == 5)
			  {
						 System.out.printf("%d\n", i);
			  }
		 }


		return 0;
	}

}

