package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{ //????
			double a; //????
			double b;
			double c;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double delta = b * b - 4 * a * c; //???????
			if (delta > 0)
			{ //????
				System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(delta)) / (a * 2),(-b - Math.sqrt(delta)) / (a * 2));
			}
			if (delta == 0)
			{
				System.out.printf("x1=x2=%.5f\n",(-b) / (a * 2));
			}
			if (delta < 0)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b) / (a * 2) + 1.0 - 1.0,Math.sqrt(-delta) / (a * 2),(-b) / (a * 2) + 1.0 - 1.0,Math.sqrt(-delta) / (a * 2));
			}
		}
		return 0; //???????????????????
	}
}

