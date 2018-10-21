package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		double a;
		double b;
		double c;
		double delta; //??????delta????real_figure?????unreliable_figure??
		double x1;
		double x2;
		double real_figure;
		double unreliable_figure;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= n; i++) //??n??????????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c; //??delta

			if (delta >= 0) //??delta????????????????????
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a); //?????x1?x2

				if (x1 == x2) //?????????????????
				{
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
				else //????????????????
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
			}
			else //delta??????????????
			{
				real_figure = b / (2 * a);
				if (real_figure != 0)
				{
					real_figure = -real_figure;
				}
				unreliable_figure = Math.sqrt(-delta) / (2 * a);
				//???????????????? 
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", real_figure);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", unreliable_figure);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", real_figure);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", unreliable_figure);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

