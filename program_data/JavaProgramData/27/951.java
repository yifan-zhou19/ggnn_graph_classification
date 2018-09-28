package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*?????? 1300012773 **
	//*???2013.10.9  **
	//********************************
	public static int Main()
	{
		double a; //?????????3???abc????delta????x1?x2
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		int n; //????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c; //???????
			if (delta == 0) //???????????????
			{
				x1 = x2 = -b / (2 * a); //??????
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (delta > 0) //????????????????
				{
					//????????
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ';');
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
				else //???????????????
				{
					x1 = x2 = -b / (2 * a); //?????????
					delta = Math.sqrt(-delta) / (2 * a); //????
					if (Math.abs(x1) < 1e-6)
					{
						x1 = x2 = 1e-7; //?????0 ??0.00000???-0.00000
					}
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", '+');
					System.out.printf("%.5f", delta);
					System.out.printf("%.5f", 'i');
					System.out.printf("%.5f", ';');
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", '-');
					System.out.printf("%.5f", delta);
					System.out.printf("%.5f", 'i');
					System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}


}

