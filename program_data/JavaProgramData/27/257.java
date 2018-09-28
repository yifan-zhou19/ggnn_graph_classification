package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double t;
		double Re;
		double Im;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			t = b * b - 4 * a * c;
			Re = -b / (2 * a);
			Im = Math.sqrt(Math.abs(t)) / (2 * a);
			if (t > 0)
			{
				x1 = Re + Im;
				x2 = Re - Im;
				if (Math.abs(x1) <= 1e-5)
				{
					x1 = 0;
				}
				else if (Math.abs(x2) <= 1e-5)
				{
					x2 = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (t == 0)
			{
				if (Math.abs(Re) <= 1e-5)
				{
					x1 = 0;
				}
				else
				{
					x1 = Re;
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (Math.abs(Re) <= 1e-5)
				{
					Re = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", Re);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Im);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", Re);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Im);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

