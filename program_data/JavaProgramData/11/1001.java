package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			int[] m = {0, 31, 60, 91, 121, 151, 182, 213, 244, 274, 305, 335, 366};
			d = m[b - 1] + c;
		}
		else
		{
			int[] m = {0, 31, 59, 90, 120, 150, 181, 212, 243, 273, 304, 334, 365};
			d = m[b - 1] + c;
		}
		System.out.print(d);
		return 0;
	}
}

