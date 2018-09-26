package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????           **
	//*????? 1300012848        **
	//*???2013.10.10             **
	//********************************
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double z;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z = -b / (2 * a);
			if (z == -0)
			{
				z = 0;
			}
			if (b * b - 4 * a * c > 0)
			{
				System.out.print("x1=");
				System.out.printf("%.5f",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				System.out.print(";x2=");
				System.out.printf("%.5f",(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				System.out.print("\n");
			}
			if (b * b - 4 * a * c == 0)
			{
				System.out.print("x1=x2=");
				System.out.printf("%.5f",z);
				System.out.print("\n");
			}
			if (b * b - 4 * a * c < 0)
			{
				System.out.print("x1=");
				System.out.printf("%.5f",z);
				System.out.print("+");
				System.out.printf("%.5f",Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.print("i;x2=");
				System.out.printf("%.5f",z);
				System.out.print("-");
				System.out.printf("%.5f",Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.print("i");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

