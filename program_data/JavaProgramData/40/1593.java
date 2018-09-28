package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double pi = 3.1415926;
		double f;
		double s = 0;
		double[] a = new double[4];
		int i;
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
			f = Double.parseDouble(tempVar2);
		}
		f = pi / 360 * f;
		void he(double,double,double,double,double);
		he(a[0], a[1], a[2], a[3], f);


	}
	public static void he(double a,double b,double c,double d,double f1)
	{
		int i;
		double sum;
		double s;
	   s = a / 2 + b / 2 + c / 2 + d / 2;
		sum = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f1) * Math.cos(f1);
		if (sum < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			sum = Math.sqrt(sum);
			System.out.printf("%.4f",sum);
		}
	}
}

