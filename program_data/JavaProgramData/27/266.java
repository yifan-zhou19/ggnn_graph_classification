package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float a;
		float b;
		float c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (n;n > 0;n--)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			double m = -b / (2 * a);
			double deta = b * b - 4 * a * c;
			if (m == -0)
			{
				m = 0;
			}
			if (deta > 1e-8)
			{
				System.out.print("x1=");
				System.out.printf("%.5f", m + Math.sqrt(deta) / (2 * a));
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", m - Math.sqrt(deta) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			else if (deta <= -1e-8)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", m);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.abs(Math.sqrt(-deta) / (2 * a)));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", m);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.abs(Math.sqrt(-deta) / (2 * a)));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
			else
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", m);
				System.out.printf("%.5f", "\n");
			}
		}

		return 0;
	}
}

