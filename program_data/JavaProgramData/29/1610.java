package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double a = 1;
			double b = 1;
			double c = 2;
			double d = 0;
			double e = 0;
			double f;
			for (f = 1;f <= n;f++)
			{
				d = d + c / b; //??
				e = b; //????b???e
				b = c; //????c???b
				c = c + e; //???c?????b+c
			}
			System.out.printf("%.3f\n",d);
		}
			return 0;
	}



}

