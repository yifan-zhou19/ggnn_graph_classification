package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1200012844 **
	//*???2012.10.5  **
	//********************************

	public static int Main() //?????
	{
		int n; //??n i s?????
		int i = 0;
		int s;
		double a = 0; //??a b c d e f g h???????
		double b = 0;
		double c = 0;
		double d = 0;
		double e;
		double f;
		double g;
		double h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (s < 19)
			{
				a = a + 1;
			}
			else if (s < 36)
			{
				b = b + 1;
			}
			else if (s < 61)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1; //??????????
			}
		}
		//???????????????????
		e = a / n * 100;
		f = b / n * 100;
		g = c / n * 100;
		h = d / n * 100;
		//???????????????????
		System.out.print("1-18: ");
		System.out.printf("%.2f", e);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("19-35: ");
		System.out.printf("%.2f", f);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("36-60: ");
		System.out.printf("%.2f", g);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("60??: ");
		System.out.printf("%.2f", h);
		System.out.print("%");
		System.out.print("\n");
		return 0;
	}

}

