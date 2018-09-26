package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int year;
		double y1 = 0;
		double y2 = 0;
		double y3 = 0;
		double y4 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //???????
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (year < 19)
			{
				y1++;
			}
			else if (year < 36)
			{
				y2++;
			}
			else if (year < 61)
			{
				y3++;
			}
			else
			{
				y4++;
			}
		}
		y1 = y1 * 100 / n;
		y2 = y2 * 100 / n;
		y3 = y3 * 100 / n;
		y4 = y4 * 100 / n;
		System.out.printf("1-18: %.2lf%\n",y1);
		System.out.printf("19-35: %.2lf%\n",y2);
		System.out.printf("36-60: %.2lf%\n",y3);
		System.out.printf("60??: %.2lf%\n",y4);


		return 0;
	}

}

