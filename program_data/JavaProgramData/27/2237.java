package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;m <= n;m = m + 1)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		if (b * b - 4 * a * c > 0F)
		{
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", ";");
			System.out.printf("%.5f", "x2=");
			System.out.printf("%.5f", x2);
			System.out.printf("%.5f", "\n");
		}
		else if (b * b - 4 * a * c <= 0F)
		{
			if (b * b - 4 * a * c == 0F)
			{
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", "\n");
			}
			else
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", -b / (2 * a) + 1 - 1);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", -b / (2 * a) + 1 - 1);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		}
		return 0;
	}

}

