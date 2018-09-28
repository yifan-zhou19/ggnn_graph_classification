package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 double a;
	 double b;
	 double c;
	 double sum;
	 double del;
	 for (i = 0;i < n;i++)
	 {
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	 del = b * b - 4 * a * c;
	if (del == 0)
	{
	System.out.print("x1=x2=");
	System.out.printf("%.5f", -b / 2 / a);
	System.out.printf("%.5f", "\n");
	}
	if (del > 0)
	{
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", (-b + Math.sqrt(del)) / 2 / a);
	System.out.printf("%.5f", ";");
	System.out.printf("%.5f", "x2=");
	System.out.printf("%.5f", (-b - Math.sqrt(del)) / 2 / a);
	System.out.printf("%.5f", "\n");
	}
	if (del < 0)
	{
		if (b != 0)
		{
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", -b / 2 / a);
	System.out.printf("%.5f", "+");
	System.out.printf("%.5f", Math.sqrt(-del) / 2 / a);
	System.out.printf("%.5f", 'i');
	System.out.printf("%.5f", ";""x2=");
	System.out.printf("%.5f", -b / 2 / a);
	System.out.printf("%.5f", "-");
	System.out.printf("%.5f", Math.sqrt(-del) / 2 / a);
	System.out.printf("%.5f", 'i');
	System.out.printf("%.5f", "\n");
		}
	if (b == 0)
	{
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", 0.00000);
	System.out.printf("%.5f", "+");
	System.out.printf("%.5f", Math.sqrt(-del) / 2 / a);
	System.out.printf("%.5f", 'i');
	System.out.printf("%.5f", ";");
	System.out.printf("%.5f", "x2=");
	System.out.printf("%.5f", 0.00000);
	System.out.printf("%.5f", "-");
	System.out.printf("%.5f", Math.sqrt(-del) / 2 / a);
	System.out.printf("%.5f", 'i');
	System.out.printf("%.5f", "\n");
	}
	}
	 }
	return 0;
	}
}

