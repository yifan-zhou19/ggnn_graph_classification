package <missing>;

public class GlobalMembers
{
	/*?????????
	???
	2012?10?7?10:46:21*/
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[1000];
		float[] b = new float[1000];
		float[] c = new float[1000];
		double[] x1 = new double[1000];
		double[] x2 = new double[1000];
		double[] d = new double[1000];
		double[] D = new double[1000];
		double[] y = new double[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //???i=n???
		{
		a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		d[i] = b[i] * b[i] - 4 * a[i] * c[i]; //???
		if (d[i] == 0) //???=0?????
		{
			x1[i] = (0 - b[i]) / (2 * a[i]);
		System.out.printf("%.5f", "x1=x2=");
		System.out.printf("%.5f", x1[i]);
		System.out.printf("%.5f", "\n");
		}
		if (d[i] > 0) //???>0 ???????
		{
			x1[i] = (Math.sqrt(d[i]) - b[i]) / (2 * a[i]),x2[i] = (0 - Math.sqrt(d[i]) - b[i]) / (2 * a[i]);
		System.out.printf("%.5f", "x1=");
		System.out.printf("%.5f", x1[i]);
		System.out.printf("%.5f", ";x2=");
		System.out.printf("%.5f", x2[i]);
		System.out.printf("%.5f", "\n");
		}
		if (d[i] < 0) //???<0???????
		{
			D[i] = 0 - d[i];
		x1[i] = Math.sqrt(D[i]) / (2 * a[i]);
		y[i] = (0 - b[i]) / (2 * a[i]);
		System.out.printf("%.5f", "x1=");
		System.out.printf("%.5f", y[i]);
		System.out.printf("%.5f", "+");
		System.out.printf("%.5f", x1[i]);
		System.out.printf("%.5f", "i;x2=");
		System.out.printf("%.5f", y[i]);
		System.out.printf("%.5f", "-");
		System.out.printf("%.5f", x1[i]);
		System.out.printf("%.5f", "i");
		System.out.printf("%.5f", "\n");
		}
		}
		return 0;
	}
}

