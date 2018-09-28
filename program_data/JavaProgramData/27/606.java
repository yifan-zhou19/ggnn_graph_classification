package <missing>;

public class GlobalMembers
{
	/*
	 *???: 1.cpp
	 *??????
	 *????: 2012-10-30
	 *??: ???????????
	 */


	public static int Main()
	{
		int n = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double Delta = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			Delta = b * b - 4 * a * c;
			if (Delta > 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", ((0 - b) + Math.sqrt(Delta)) / (2 * a));
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", ((0 - b) - Math.sqrt(Delta)) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			if (Delta == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", (0 - b) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			if (Delta < 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", (0 - b) / (2 * a));
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.sqrt((-1) * Delta) / (2 * a));
				System.out.printf("%.5f", "i;");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", (0 - b) / (2 * a));
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.sqrt((-1) * Delta) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

