package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n; i++) //??i?1?n???
		{ //????
			double a; //?????????a,b,c
			double b;
			double c;

			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			double delta = b * b - 4 * a * c; //?????delta
			double line = -b / (2 * a); //??????-b/(2*a)
			if (line == -0)
			{
				line = 0;
			}
			if (delta == 0) //??delta?0
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", line);
				System.out.printf("%.5f", "\n");
			}
			else if (delta > 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", line + Math.sqrt(delta) / (2 * a));
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", line - Math.sqrt(delta) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			else if (delta < 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", line);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", (Math.sqrt(-delta)) / (2 * a));
				System.out.printf("%.5f", "i;");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", line);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", (Math.sqrt(-delta)) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

