package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double mianji = new double(double a,double b,double c,double d,double j);
		double a;
		double b;
		double c;
		double d;
		double j;
		double jj;
		double ss;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			j = Double.parseDouble(tempVar5);
		}
		jj = j * p / t;
		ss = mianji(a, b, c, d, jj);
		if (ss != -1)
		{
			System.out.printf("%.4lf\n",ss);
		}
		   else
		   {
			   System.out.print("Invalid input\n");
		   }
	}

	public static double mianji(double a,double b,double c,double d,double jj)
	{
		double s;
		double q;
		double qq;
		s = (a + b + c + d) / 2;
		q = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(jj) * Math.cos(jj);
		if (q < 0)
		{
			qq = -1;
		}
		   else
		   {
			   qq = Math.sqrt(q);
		   }
		return (qq);
	}
}

