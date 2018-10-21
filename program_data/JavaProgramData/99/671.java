package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1200012827 **
	//*???2012.10.4  **
	//********************************
	public static int Main() // ???
	{ // ?????
	int x; // ?????????
	int k = 1;
	double a = 0.0; // ?????????????
	double b = 0.0;
	double c = 0.0;
	double d = 0.0;
	double n;
	n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	{ // ????
	while (k <= n)
	{
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (x <= 18) // ??????????????
	{
	a = a + 1;
	}
	else if (19 <= x != 0 && x <= 35)
	{
	b = b + 1;
	}
	else if (36 <= x != 0 && x <= 60)
	{
	c = c + 1;
	}
	else
	{
	d = d + 1;
	}
	k = k + 1;
	} // ????
	double A; // ?????????
	double B;
	double C;
	double D;
	A = a / n * 100; // ????
	B = b / n * 100;
	C = c / n * 100;
	D = d / n * 100;
	System.out.printf("%f", "1-18: ");
	System.out.printf("%.2f", A);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "19-35: ");
	System.out.printf("%.2f", B);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "36-60: ");
	System.out.printf("%.2f", C);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "60??: ");
	System.out.printf("%.2f", D);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	}
	return 0;
	} // ?????


}

