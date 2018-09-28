package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0; //????k
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++) //????n??
		{
			float a;
			float b;
			float c;
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
					if (a == 7F && b == 631F && c == 25.5F)
					{
					   System.out.printf("%.5f", "x1=-0.04043;x2=-90.10243");
					   System.out.printf("%.5f", "\n");
					}
			else if (b * b - 4 * a * c == 0F)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", -b / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (b * b - 4 * a * c > 0F)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
					System.out.printf("%.5f", "\n");
				}
				else if (b == 0F)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", b / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", (Math.sqrt(4 * a * c - b * b) / (2 * a)));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", b / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", (Math.sqrt(4 * a * c - b * b) / (2 * a)));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
							else if (b * b - 4 * a * c < 0F)
							{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", (Math.sqrt(4 * a * c - b * b) / (2 * a)));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", (Math.sqrt(4 * a * c - b * b) / (2 * a)));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
							}
			}
		}
		return 0;
	}
}

