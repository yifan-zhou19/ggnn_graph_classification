package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] s = new double[5];
		double p;
		double di = 1;
		int i;
		int k;
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Double.parseDouble(tempVar);
			}
		}
		p = (s[1] + s[2] + s[3] + s[0]) / 2;
		for (k = 0;k < 4;k++)
		{
			di *= (p - s[k]);
		}
		if (di < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			double ss;
			double hudu;
			hudu = ((s[4] / 2) / 180) * PI;
			ss = Math.pow((di - s[1] * s[2] * s[3] * s[0] * Math.pow(Math.cos(hudu),2)),0.5);
			System.out.printf("%.4lf\n",ss);
		}
		return 0;
	}
}

