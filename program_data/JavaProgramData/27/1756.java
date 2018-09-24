package <missing>;

public class GlobalMembers
{
	//**************************
	//*???????????? (1051)**
	//*?????? 1200012888 **
	//*???2013.10.10**
	//**************************
	public static int Main()
	{
		double a; //????a b c????x1 x2
		double b;
		double c;
		double x1;
		double x2;
		int n; //?????? n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= n ; i++) //???????????????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (Math.sqrt(b * b - 4 * a * c) > 0) //??????????
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //??????? x1 x2
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
															//??x1 x2 ????????
			}
			else if (Math.sqrt(b * b - 4 * a * c) == 0) //??????
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
															//??x1=x2=... ????????
			}
			else //???? ??i????????
			{
				if ((-b) / (2 * a) != 0) //????????????? -0
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (-b) / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					//?? x1 ? ????? ??????
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", (-b) / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
					//?? x2 ? ????? ??????
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (b) / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					//?? x1 ? ????? ??????
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", (b) / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
					//?? x2 ? ????? ??????
				}
			}
		}
		return 0;
	}
}

