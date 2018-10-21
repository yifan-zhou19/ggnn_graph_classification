package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			double a;
			double b;
			double c;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if ((b * b - 4 * a * c) > 0)
			{
			  System.out.printf("x1=%.5f", (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			  System.out.print(";");
			   System.out.printf("x2=%.5f",(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			   System.out.print("\n");
			}
			if ((b * b - 4 * a * c) == 0)
			{
				   System.out.printf("x1=x2=%.5f",-b / (2 * a));
				   System.out.print("\n");
			}
			if ((b * b - 4 * a * c) < 0)
			{
				if (b == 0)
				{
					System.out.printf("x1=0.00000+%.5fi",Math.sqrt(4 * a * c - b * b) / (2 * a));
					 System.out.print(";");
					  System.out.printf("x2=0.00000-%.5fi",Math.sqrt(4 * a * c - b * b) / (2 * a));
					  System.out.print("\n");
				}
				else
				{
				System.out.printf("x1=%.5f+%.5fi",-b / (2 * a),Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.print(";");
				   System.out.printf("x2=%.5f-%.5fi",-b / (2 * a),Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

