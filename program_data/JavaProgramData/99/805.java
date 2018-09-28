package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????  **
	//*??????  1200062706**
	//*???2012.10.07  **
	//********************************
	public static int Main()
	{
		double k; //????k???????b?c?d?e????0
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++) //??????????k??
		{

			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 1 && a <= 18)
			{
				b = b + 1;
			}
			if (a >= 19 && a <= 35)
			{
				c = c + 1;
			}
			if (a >= 36 && a <= 60)
			{
				d = d + 1;
			}
			if (a > 60)
			{
				e = e+1;
			}
		}
		double A;
		double B;
		double C;
		double D;
		A = b * 100 / (b + c + d + e);
		B = c * 100 / (b + c + d + e);
		C = d * 100 / (b + c + d + e);
		D = e * 100 / (b + c + d + e);
		System.out.printf("%.2f", "1-18: ");
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
		return 0;
	}

}

