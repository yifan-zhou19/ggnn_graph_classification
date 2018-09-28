package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???????????
		int i;
		double a; //???????????-b/2a
		double b;
		double c;
		double deta;
		double x1;
		double x2;
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			t = - b / (2 * a);
			deta = b * b - 4 * a * c; //??t?deta(???)

			//?deta>0??????
			if (deta > 0)
			{
				x1 = (- b + Math.sqrt(deta)) / (2 * a);
				x2 = (- b - Math.sqrt(deta)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}

			//??????????
			else if (deta == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", t);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				deta = -deta;
				if (t == 0)
				{
					t = 0; //??0?????????
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", t);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.sqrt(deta) / (2 * a));
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", t);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.sqrt(deta) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}









}

