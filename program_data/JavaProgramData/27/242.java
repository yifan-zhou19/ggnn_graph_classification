package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	double a;
	double b;
	double c;
	double x1;
	double x2;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	if ((b * b - 4 * a * c) > 0)
	{
	x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.print("x1=");
	System.out.printf("%.5f",x1);
	System.out.print(";x2=");
	System.out.printf("%.5f",x2);
	System.out.print("\n");
	}
	else
	{
	if (b * b - 4 * a * c == 0)
	{
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.print("x1=x2=");
	System.out.printf("%.5f",x1);
	System.out.print("\n");
	}
	else
	{
		x1 = -b / (2 * a);
		x2 = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
	if (x2 < 0)
	{
		x2 = -x2;
	}
	if (x1 == -0)
	{
		x1 = 0;
	}
	System.out.print("x1=");
	System.out.printf("%.5f",x1);
	System.out.print("+");
	System.out.printf("%.5f",x2);
	System.out.print("i;");
	System.out.print("x2=");
	System.out.printf("%.5f",x1);
	System.out.print("-");
	System.out.printf("%.5f",x2);
	System.out.print("i");
	System.out.print("\n");

	}
	}

	}



	}

}

