package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[100];
		double[] y = new double[100];
		double[] d = new double[1000];
		double dis = 0;
		for (i = 0;i <= 999;i++)
		{
			d[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2));
			k = k + 1;
			}
		}
		for (k = 0;k < 1000;k++)
		{
		   if (d[k] > dis)
		   {
			   dis = d[k];
		   }
		}
			  System.out.printf("%.4f\n", dis);
			return 0;
	}

}

