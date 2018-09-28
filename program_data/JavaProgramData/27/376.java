package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double t;
		double x1;
		double x2;
		int n;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < n + 1;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			t = -b / (2 * a);
			if (Math.abs(b * b - 4 * a * c) < 1e-9)
			{
				System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
			}
				else if ((b * b - 4 * a * c) > 0)
				{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
			else
			{
				if (Math.abs(t) < 1e-9)
				{
					t = 0;
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", t, Math.sqrt(-(b * b - 4 * a * c)) / (2 * a),t,Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
			}
		}
		return 0;
	}
}

