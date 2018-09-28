package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			s = 1;
			System.out.printf("%.0lf",s);
		}
		if (n == 1)
		{
			s = 2;
				System.out.printf("%.0lf",s);

		}
		if (n >= 2)
		{
			s = 1;
			i = 1;
			while (i <= n)
			{
				s = 2 * s;
				i++;
			}
			System.out.printf("%.0lf",s);
		}

		return 0;
	}

}

