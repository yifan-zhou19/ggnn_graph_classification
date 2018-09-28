package <missing>;

public class GlobalMembers
{
	//********************************
	//*??  ?????????  *****
	//*????? 1300012753     ***** 
	//*???2013.10.09          *****  
	//********************************
	public static int Main()
	{
		int n; // n????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		// ????????
		for (int i = 1; i <= n; i++)
		{
			double a; // a?b?c??????
			double b;
			double c;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double x1; // ??x1 x2???????deta??b^2-4ac
			double x2;
			double deta;

			// ????????? 
			deta = b * b - 4.0 * a * c;
			if (deta == 0) // ??deta??0??x1=x2??????
			{
				x1 = (-b) / (2.0 * a);
				if (x1 == -0) // ??x1?????-0????0
				{
					  x1 = 0;
				}
				System.out.printf("x1=x2=%.5lf\n", x1);
			}
			else if (deta > 0)
			{
				 x1 = (-b + Math.sqrt(deta)) / (2 * a);
				 x2 = (-b - Math.sqrt(deta)) / (2 * a);
				 if (x1 == -0)
				 {
					  x1 = 0;
				 }
				if (x2 == -0)
				{
					  x2 = 0;
				}
				 System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
			}
			else // ??deta??0???????????
			{
				double s;
				double x;
				s = (-b) / (2.0 * a);
				x = (Math.sqrt(-deta)) / (2 * a);
				if (s == -0)
				{
					  s = 0;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", s, x, s, x);
			}
		}
		return 0;
	}
}

