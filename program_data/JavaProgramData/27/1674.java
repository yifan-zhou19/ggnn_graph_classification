package <missing>;

public class GlobalMembers
{
	public static float[] a = new float[100];
	public static float[] b = new float[100];
	public static float[] c = new float[100];
	public static int Main()
	{
			double x1;
			double x2;
			double p;
			double q;
			double s;
			int n;
			int i;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print("\n");
			for (i = 1;i <= n;i++)
			{
				a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				c[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				System.out.print("\n");
				if (b[i] * b[i] - 4 * a[i] * c[i] >= 0F)
				{
					x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
					x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
					if (x1 == x2)
					{
						System.out.printf("%.5f", "x1=x2=");
						System.out.printf("%.5f", x1);
					}
					if (x1 != x2)
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", x1);
						System.out.printf("%.5f", ';');
						System.out.printf("%.5f", "x2=");
						System.out.printf("%.5f", x2);
					}
				}
				if (b[i] * b[i] - 4 * a[i] * c[i] < 0F)
				{
					p = -b[i] / (2 * a[i]);
					q = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
					if (p != 0)
					{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", p);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", q);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", p);
					System.out.printf("%.5f", -q);
					System.out.printf("%.5f", "i");
					}
					if (p == 0)
					{
					System.out.printf("%.5f", "x1=0.00000");
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", q);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=0.00000");
					System.out.printf("%.5f", -q);
					System.out.printf("%.5f", "i");
					}

				}
			}
			return 0;
	}




}

