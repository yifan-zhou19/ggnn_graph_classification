package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double x;
		double y;
		double z = 0;
		double l;
		double[] a = new double[100];
		double[] b = new double[100];
		for (i = 0;i < n;i++)
		{
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i] = x,b[i] = y;
		}
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < n;k++)
			{
				l = Math.pow((a[j] - a[k]),2) + Math.pow((b[j] - b[k]),2);
				if (l > z)
				{
					z = l;
				}
			}
		}
		System.out.printf("%.4f\n",Math.pow(z,0.5));
		return 0;
	}
}

