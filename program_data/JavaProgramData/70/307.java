package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int t = 0;
		double[] x = new double[99];
		double[] y = new double[99];
		double[] s = new double[999];
		double max;
		double[] h = new double[999];
		double[] z = new double[999];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				h[t] = x[i] - x[j];
				z[t] = y[i] - y[j];
				s[t] = Math.sqrt(Math.pow(h[t],2) + Math.pow(z[t],2));
				t++;
			}
		}
		for (i = 0;i < t;i++)
		{
			if (i == 0)
			{
				max = s[i];
			}
			else if (s[i] > max)
			{
				max = s[i];
			}
		}
		System.out.printf("%.4lf",max);
	}











}

