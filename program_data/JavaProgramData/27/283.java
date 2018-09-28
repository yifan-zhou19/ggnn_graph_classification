package <missing>;

public class GlobalMembers
{
	/*
	???:????????
	???:??
	????:2011.9.16
	*/
	public static int Main() //???
	{ //?????
		int n;
		int num;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (n = 0; n < num; n++)
		{ //????
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c; //?????
			e = (0 - b) / (2 * a);
			if (d == 0) //??????0???????
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "\n");
			}
			else //???????0????????
			{
				if (d > 0) //??????0????????
				{
					f = Math.sqrt(d) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", e + f);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", e - f);
					System.out.printf("%.5f", "\n");
				}
				else //??????0????????
				{
						f = Math.sqrt(-d) / (2 * a);
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", e);
						System.out.printf("%.5f", "+");
						System.out.printf("%.5f", f);
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", ";");
						System.out.printf("%.5f", "x2=");
						System.out.printf("%.5f", e);
						System.out.printf("%.5f", "-");
						System.out.printf("%.5f", f);
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", "\n");
				}
			}
		}
			return 0;
	} //?????
}

