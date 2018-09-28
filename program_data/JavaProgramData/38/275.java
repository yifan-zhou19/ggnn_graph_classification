package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			int n;
			double[] a = new double[102];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0; i < n; i++)
			{
				a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			double[] p = a;
			p = a[0];
			double ave = 0;
			while (p < a[n])
			{
				ave += p[0];
				p++;
			}
			ave /= n;
			double res = 0;
			p = a[0];
			while (p < a[n])
			{
				res += (p[0] - ave) * (p[0] - ave);
				p++;
			}
			res /= n;
			res = Math.sqrt(res);
			System.out.printf("%.5lf\n",res);
		}
		return 0;
	}
}

