package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[][] formal = new float[n][3];
		for (int i = 0; i < n; i++)
		{
			formal[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			formal[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			formal[i][2] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		double x1;
		double x2;
		double delta;
		double unfi;
		for (int i = 0; i < n; i++)
		{
			delta = formal[i][1] * formal[i][1] - (4 * formal[i][0] * formal[i][2]);
			if (delta > 0)
			{
				x1 = (-formal[i][1] + Math.sqrt(delta)) / (2 * formal[i][0]);
				x2 = (-formal[i][1] - Math.sqrt(delta)) / (2 * formal[i][0]);
				if (x1 == -0)
				{
					x1 = 0;
				}
				else if (x2 == -0)
				{
					x2 = 0;
				}
				System.out.printf("%f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (delta == 0)
			{
				x1 = -formal[i][1] / (2 * formal[i][0]);
				if (x1 == -0)
				{
					x1 = 0;
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				unfi = Math.abs(Math.sqrt(-delta) / (2 * formal[i][0]));
				x1 = -formal[i][1] / (2 * formal[i][0]);
				if (x1 == -0)
				{
					x1 = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", unfi);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", unfi);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

