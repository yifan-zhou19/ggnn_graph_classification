package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float delta;
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	delta = b * b - 4 * a * c;
	if (b != 0F)
	{
	if (delta > 0F)
	{
		System.out.print("x1=");
	System.out.printf("%.5f", (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.print(";x2=");
	System.out.printf("%.5f", (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.print("\n");
	}
	if (delta == 0F)
	{
		System.out.print("x1=x2=");
	System.out.printf("%.5f", (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.print("\n");
	}
	if (delta < 0F)
	{
		delta = -delta;
	System.out.print("x1=");
	System.out.printf("%.5f", (-b) / (2 * a));
	System.out.print("+");
	System.out.printf("%.5f", Math.sqrt(delta) / (2 * a));
	System.out.print("i;x2=");
	System.out.printf("%.5f", (-b) / (2 * a));
	System.out.print("-");
	System.out.printf("%.5f", Math.sqrt(delta) / (2 * a));
	System.out.print("i");
	System.out.print("\n");

	}
	}
	else
	{
	if (delta > 0F)
	{
		System.out.print("x1=");
	System.out.printf("%.5f", (b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.print(";x2=");
	System.out.printf("%.5f", (b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.print("\n");
	}
	if (delta == 0F)
	{
		System.out.print("x1=x2=");
	System.out.printf("%.5f", (b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.print("\n");
	}
	if (delta < 0F)
	{
		delta = -delta;
	System.out.print("x1=");
	System.out.printf("%.5f", (b) / (2 * a));
	System.out.print("+");
	System.out.printf("%.5f", Math.sqrt(delta) / (2 * a));
	System.out.print("i;x2=");
	System.out.printf("%.5f", (b) / (2 * a));
	System.out.print("-");
	System.out.printf("%.5f", Math.sqrt(delta) / (2 * a));
	System.out.print("i");
	System.out.print("\n");

	}
	}
	}
	return 0;
	}
}

