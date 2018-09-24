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
		for (int i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double delta = b * b - 4 * a * c;
		if (delta == 0)
		{
			System.out.print("x1=x2=");
		System.out.printf("%.5f",((-b / (2 * a))));
		System.out.print("\n");
		}
		else if (delta > 0)
		{
		System.out.print("x1=");
		System.out.printf("%.5f",((-b + Math.sqrt(delta)) / (2 * a)));
		System.out.print(";");
		System.out.print("x2=");
		System.out.printf("%.5f",((-b - Math.sqrt(delta)) / (2 * a)));
		System.out.print("\n");
		}
		if (delta < 0)
		{
			delta = -delta;
			System.out.print("x1=");
		if (b == 0)
		{
			 System.out.printf("%.5f",(b / (2 * a)));
		}
			else
			{
				System.out.printf("%.5f",(-b / (2 * a)));
			}
			System.out.print("+");
			System.out.printf("%.5f",(Math.sqrt(delta) / (2 * a)));
			System.out.print("i");
			System.out.print(";x2=");
			if (b == 0)
			{
			 System.out.printf("%.5f",(b / (2 * a)));
			}
			else
			{
				System.out.printf("%.5f",(-b / (2 * a)));
			}
			System.out.print("-");
			System.out.printf("%.5f",(Math.sqrt(delta) / 2 / a));
			System.out.print("i");
			System.out.print("\n");
		}
		}
		return 0;
	}
}

