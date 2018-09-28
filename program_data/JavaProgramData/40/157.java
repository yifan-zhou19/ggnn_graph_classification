package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] arrey = new double[5];
		double m;
		int i;
		for (i = 0 ; i < 5 ; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Double.parseDouble(tempVar);
			}
			arrey[i] = m;
		}
		double s;
		double f;
		double k;
		k = (arrey[4] * PI) / 360;
		s = (double)1 / 2 * (arrey[0] + arrey[1] + arrey[2] + arrey[3]);
		if (((s - arrey[0]) * (s - arrey[1]) * (s - arrey[2]) * (s - arrey[3]) - arrey[0] * arrey[1] * arrey[2] * arrey[3] * Math.cos(k) * Math.cos(k)) >= 0)
		{
			f = Math.sqrt((s - arrey[0]) * (s - arrey[1]) * (s - arrey[2]) * (s - arrey[3]) - arrey[0] * arrey[1] * arrey[2] * arrey[3] * Math.cos(k) * Math.cos(k));
			System.out.printf("%.4f", f);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}


}

