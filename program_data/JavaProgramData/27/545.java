package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[][] a = new float[n][3];
		double d;
		double x;
		double y;
		i = 1;
		while (i <= n)
		{
			  a[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  a[i][2] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  a[i][3] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  i++;
		}
		i = 1;
		while (i <= n)
		{
			  d = a[i][2] * a[i][2] - 4 * a[i][1] * a[i][3];
			  if (d == 0)
			  {
					   x = -a[i][2] / (2 * a[i][1]);
					   System.out.printf("%.5f", "x1=x2=");
					   System.out.printf("%.5f", x);
					   System.out.printf("%.5f", "\n");
			  }
			  if (d > 0)
			  {
					   x = (-a[i][2] + Math.sqrt(d)) / (2 * a[i][1]);
					   y = (-a[i][2] - Math.sqrt(d)) / (2 * a[i][1]);
					   System.out.printf("%.5f", "x1=");
					   System.out.printf("%.5f", x);
					   System.out.printf("%.5f", ";x2=");
					   System.out.printf("%.5f", y);
					   System.out.printf("%.5f", "\n");
			  }
			  if (d < 0)
			  {
					   x = -a[i][2] / (2 * a[i][1]);
					   y = Math.sqrt(-d) / (2 * a[i][1]);
					   if (x == -0)
					   {
							  x = 0;
					   }
					   System.out.printf("%.5f", "x1=");
					   System.out.printf("%.5f", x);
					   System.out.printf("%.5f", "+");
					   System.out.printf("%.5f", y);
					   System.out.printf("%.5f", "i;x2=");
					   System.out.printf("%.5f", x);
					   System.out.printf("%.5f", "-");
					   System.out.printf("%.5f", y);
					   System.out.printf("%.5f", "i");
					   System.out.printf("%.5f", "\n");
			  }
			  i++;
		}
		return 0;
	}





}

