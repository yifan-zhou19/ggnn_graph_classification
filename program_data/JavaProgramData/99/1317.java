package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 1;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x <= 18)
			{
				a++;
			}
			if (x >= 19 && x <= 35)
			{
				b++;
			}
			if (x >= 36 && x <= 60)
			{
				c++;
			}
			if (x >= 61)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double) a / n * 100);
		System.out.printf("19-35: %.2lf%%\n",(double) b / n * 100);
		System.out.printf("36-60: %.2lf%%\n",(double) c / n * 100);
		System.out.printf("60??: %.2lf%%\n",(double) d / n * 100);
		return 0;
	}
}

