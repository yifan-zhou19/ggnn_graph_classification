package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double tmp;
		double m;
		double n;
		int i;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < num; i++)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			tmp = b * b - 4 * a * c;
			if (tmp > 0)
			{
				x1 = (- b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (- b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (tmp == 0)
			{
				x1 = (- b) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (b != 0F)
				{
					m = (- b) / (2 * a);
				}
				else
				{
					m = b / (2 * a);
				}
				n = (Math.sqrt(- tmp)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", m);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", n);
				System.out.printf("%.5f", "i;");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", m);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", n);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}

		return 0;
	}
}

