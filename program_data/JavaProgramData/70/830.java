package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		double[] x = new double[1000];
		double[] y = new double[1000];
		double[] temp = new double[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 1;p <= n;p++)
		{
	x[p] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	y[p] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double dis;
		dis = 0;
		int t;
		t = 1;
		for (p = 1;p <= n;p++)
		{
		for (q = 1;q <= n;q++)
		{
	temp[t] = Math.sqrt((x[p] - x[q]) * (x[p] - x[q]) + (y[p] - y[q]) * (y[p] - y[q]));
		if (dis < temp[t])
		{
		   dis = temp[t];
		}
		t = t + 1;
		}
		}
		 System.out.printf("%.4f\n",dis);
		 return 0;
	}


}

