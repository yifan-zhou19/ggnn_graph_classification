package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ni;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (ni = 1;ni <= n;ni = ni + 1)
		{
			double a;
			double b;
			double c;
			double x1;
			double x2;
			double t;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			t = (-b) / (2 * a);
			if (Math.abs(t) < 1e-9)
			{
			 t = 0;
			}
			if (b * b - 4 * a * c > 0)
			{
				System.out.print("x1=");
				System.out.printf("%.5f",(t + Math.sqrt(b * b - 4 * a * c) / (2 * a)));
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5f",(t - Math.sqrt(b * b - 4 * a * c) / (2 * a)));
				System.out.print("\n");
			}
			else if (b * b - 4 * a * c == 0)
			{
				System.out.print("x1=x2=");
				System.out.printf("%.5f", t);
				System.out.print("\n");
			}
			else
			{
				System.out.print("x1=");
				System.out.printf("%.5f", t);
				System.out.print("+");
				System.out.printf("%.5f",(Math.sqrt(4 * a * c - b * b) / (2 * a)));
				System.out.print("i;");
				System.out.print("x2=");
				System.out.printf("%.5f",t);
				System.out.print("-");
				System.out.printf("%.5f",(Math.sqrt(4 * a * c - b * b) / (2 * a)));
				System.out.print('i');
				System.out.print("\n");
			}
		}
		return 0;
	}


}

