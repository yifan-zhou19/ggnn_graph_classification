package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = (double)Math.pow(2,a);
		System.out.printf("%f", b);
		System.out.printf("%f", "\n");
		return 0;
	}

}

