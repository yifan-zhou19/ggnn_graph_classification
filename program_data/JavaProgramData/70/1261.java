public class dian
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static dian[] dian = tangible.Arrays.initializeWithDefaultdianInstances(100); //????

	public static int Main()
	{
		int n;
		int xm;
		int ym;
		double d;
		double dmax = 0.0000;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			dian[i].x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			dian[i].y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = 1;j < n;j++)
			{
				d = (dian[i].x - dian[j].x) * (dian[i].x - dian[j].x) + (dian[i].y - dian[j].y) * (dian[i].y - dian[j].y);
				d = Math.sqrt(d);
				if (d > dmax)
				{
					dmax = d;
				}
			}
		}
		System.out.printf("%.4f\n",dmax);
		return 0;
	}
}

