package <missing>;

public class GlobalMembers
{
	public static double s(double a,double b,double c,double d)

	{

			double s;

			s = (a + b + c + d) / 2;

			return (s);

	}

	public static double cos2(double r)

	{

			double k;
			double i;

			k = Math.cos(r / 2 * 3.1415926 / 180);

			i = k * k;

			return (i);

	}

	public static void Main()

	{

			double S;
			double temp;

			double a;
			double b;
			double c;
			double d;
			double r;

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
				r = Double.parseDouble(tempVar5);
			}

			temp = (s(a, b, c, d) - a) * (s(a, b, c, d) - b) * (s(a, b, c, d) - c) * (s(a, b, c, d) - d) - a * b * c * d * cos2(r);

			if (temp < 0)
			{

				   System.out.print("Invalid input\n");
			}

			else

			{

				   S = Math.sqrt(temp);

				   System.out.printf("%.4lf",S);

			}

	}


}

