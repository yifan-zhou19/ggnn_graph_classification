package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		if (b != 0)
		{
			if (b * b - 4.0 * a * c == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",(double)(-b / (2 * a)));
			}
				else
				{
				if (b * b - 4.0 * a * c > 0)
				{
					System.out.printf("x1=%.5lf;x2=%.5lf\n",(-1.0 * b + Math.sqrt(b * b - 4 * a * c)) / (2.0 * a),(-1.0 * b - Math.sqrt(b * b - 4 * a * c)) / (2.0 * a));
				}
				else
				{
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-1.0 * b / (2.0 * a),Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2.0 * a),-1.0 * b / (2.0 * a),Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2.0 * a));
				}
				}
		}
			else
			{
				if (b * b - 4.0 * a * c == 0)
				{
				System.out.printf("x1=x2=%.5lf\n",(double)0.00000);
				}
				else
				{
				if (b * b - 4.0 * a * c > 0)
				{
					System.out.printf("x1=%.5lf;x2=%.5lf\n",(Math.sqrt(b * b - 4 * a * c)) / (2.0 * a),(Math.sqrt(b * b - 4 * a * c)) / (2.0 * a));
				}
				else
				{
					System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2.0 * a),Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2.0 * a));
				}
				}
			}
		}
		return 0;
	}

}

