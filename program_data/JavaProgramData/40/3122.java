package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double[] a = new double[4];
		double c;
		double s;
		double S;
		double l;
		for (i = 0;i < 4;i++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Double.parseDouble(tempVar);
		   }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Double.parseDouble(tempVar2);
		}
		c = c * PI / 180;
		s = (a[0] + a[1] + a[2] + a[3]) / 2;
		l = (s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(c / 2) * Math.cos(c / 2);
		if (l < 0)
		{
		   System.out.print("Invalid input\n");
		}
		else
		{
		   S = Math.sqrt(l);
		   System.out.printf("%.4lf\n",S);
		}
	}

}

