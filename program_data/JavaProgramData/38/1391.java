package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int n;
		int i;
		double s;
		double r;
		double p;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t > 0)
		{
							n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							s = 0;
							p = 0;
							for (i = 1;i <= n;i++)
							{
								r = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
								s += r * r;
								p += r;
							}
							p = p / n;
							s = Math.sqrt(s / n - p * p);
							System.out.printf("%.5f", s);
							System.out.printf("%.5f", "\n");
							t--;
		}
	}


}

