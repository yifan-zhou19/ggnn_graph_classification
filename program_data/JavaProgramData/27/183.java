package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double cha;
		double x1;
		double x2;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		for (j = 0 ; j < n; j++)
		{
			a[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			cha = (double) b[j] * b[j] - 4 * a[j] * c[j];
			if (cha > 0)
			{
				x1 = (-b[j] + Math.sqrt(cha)) / (2 * a[j]);
				x2 = (-b[j] - Math.sqrt(cha)) / (2 * a[j]);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (cha == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", -b[j] / (2 * a[j]));
				System.out.printf("%.5f", "\n");
			}
			else
			{
				double i = -b[j] / (2 * a[j]);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", i);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.sqrt(-cha) / (2 * a[j]));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", i);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.sqrt(-cha) / (2 * a[j]));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}


}

