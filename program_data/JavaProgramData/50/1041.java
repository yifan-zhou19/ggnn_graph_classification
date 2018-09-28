public class form
{
	public int month;
	public int day;
	public int date;
}

package <missing>;

public class GlobalMembers
{
	public static form[] every = tangible.Arrays.initializeWithDefaultformInstances(365);

	public static void Main()
	{
		int firstday;
		int month = 1;
		int date = 1;
		int day;
		int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			firstday = Integer.parseInt(tempVar);
		}
		day = firstday;
		for (i = 0;i < 365;i++)
		{
			every[i].month = month;
			every[i].day = day;
			every[i].date = date;
			if (every[i].date == monthday[month - 1])
			{
				month++;
				date = 1;
			}
			else
			{
				date++;
			}
			if (every[i].day == 7)
			{
				day = 1;
			}
			else
			{
				day++;
			}
		}
		for (i = 0;i < 365;i++)
		{
			if (every[i].date == 13 && every[i].day == 5)
			{
				System.out.printf("%d\n",every[i].month);
			}
		}
	}

}

