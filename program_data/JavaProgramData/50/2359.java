public class Date
{
	public int iLab;
	public int iMonth;
	public int iDay;
}

package <missing>;

public class GlobalMembers
{
	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static Date DNow;

	public static void Date_Walk()
	{
		for (int x = 1;x <= 12;x++)
		{
			for (int y = 1;y <= month[x];y++)
			{
				DNow.iLab++;
				if (DNow.iLab > 7)
				{
					DNow.iLab = 1;
				}
				if (y == 13 && DNow.iLab == 5)
				{
					System.out.print(x);
					System.out.print("\n");
				}
			}
		}
		return;
	}

	public static int Main()
	{
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		DNow.iMonth = 1,DNow.iDay = 1,DNow.iLab = w - 1;
		Date_Walk();
		return 0;
	}

}

