package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] p = new double[10][3];
		for (int i = 0;i < n;i++)
		{
			double a;
			double b;
			double c;
			p[i][0] = a;
			p[i][1] = b;
			p[i][2] = c;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			double x1;
			double x2;
			if ((b * b - 4 * a * c) > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if ((b * b - 4 * a * c) == 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else if ((b * b - 4 * a * c) < 0)
			{
				double d;
				double e;
				if (b != 0)
				{
				   d = -b / (2 * a);
				}
				else if (b == 0)
				{
				   d = b / (2 * a);
				}
				e = Math.sqrt(4 * a * c - b * b) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",d,e,d,e);
			}
			else
			{
				;
			}
		}
	}
}

